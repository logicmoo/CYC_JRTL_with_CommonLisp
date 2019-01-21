package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_sme_lexification_wizard extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_sme_lexification_wizard";
    public static final String myFingerPrint = "8b99d6aea64c86a19d3be5aeaa6d103d9d9d41c063d4296cad7255e268ba7919";
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 933L)
    public static SubLSymbol $sme_lexwiz_verboseP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1066L)
    private static SubLSymbol $html_tab_expansion$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1239L)
    private static SubLSymbol $max_sme_listbox_size$;
    private static final SubLSymbol $sym0$_SME_LEXWIZ_VERBOSE__;
    private static final SubLString $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb;
    private static final SubLSymbol $sym2$HTML_QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym3$QUESTION_ANSWERING_AGENT;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$OBJECT;
    private static final SubLSymbol $sym6$INSTANCE_COUNT;
    private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS;
    private static final SubLSymbol $sym8$ISOLATED_P;
    private static final SubLSymbol $sym9$INSTANCE_NUMBER;
    private static final SubLSymbol $sym10$ID;
    private static final SubLSymbol $sym11$TITLE;
    private static final SubLSymbol $sym12$QUESTION;
    private static final SubLSymbol $sym13$TIP;
    private static final SubLSymbol $sym14$QUESTION_TYPE;
    private static final SubLSymbol $sym15$ERROR_MESSAGE;
    private static final SubLSymbol $sym16$CHOICES;
    private static final SubLSymbol $sym17$DESCRIPTIONS;
    private static final SubLSymbol $sym18$VALUES;
    private static final SubLSymbol $sym19$DEFAULT;
    private static final SubLSymbol $sym20$ANSWER;
    private static final SubLSymbol $sym21$FIELD_WIDTH;
    private static final SubLSymbol $sym22$FIELD_LABELS;
    private static final SubLSymbol $sym23$PROXY;
    private static final SubLSymbol $sym24$CALLBACK_FUNCTION;
    private static final SubLSymbol $sym25$CLIENT_DATA;
    private static final SubLSymbol $sym26$USER_DATA;
    private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC;
    private static final SubLSymbol $sym28$DISPLAY_QUESTION;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLString $str31$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str32$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw33$UNINITIALIZED;
    private static final SubLSymbol $sym34$DISPLAY_QUESTION_PREAMBLE;
    private static final SubLString $str35$post;
    private static final SubLString $str36$handle_html_question_answering;
    private static final SubLSymbol $sym37$DISPLAY_QUESTION_TRAILER;
    private static final SubLSymbol $sym38$_EXIT;
    private static final SubLSymbol $sym39$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD;
    private static final SubLSymbol $kw42$SME_LEXWIZ;
    private static final SubLSymbol $sym43$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD;
    private static final SubLSymbol $sym46$DISPLAY_QUESTION_PROPER;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD;
    private static final SubLSymbol $kw49$RED;
    private static final SubLString $str50$Error__;
    private static final SubLString $str51$_object_id;
    private static final SubLSymbol $kw52$BOOLEAN;
    private static final SubLString $str53$_positive_choice;
    private static final SubLString $str54$_yes;
    private static final SubLString $str55$_negative_choice;
    private static final SubLString $str56$_no;
    private static final SubLSymbol $kw57$ENUMERATED;
    private static final SubLString $str58$_response;
    private static final SubLString $str59$OK;
    private static final SubLString $str60$_ok;
    private static final SubLSymbol $kw61$MULTIPLE_SELECTION;
    private static final SubLString $str62$Submit;
    private static final SubLSymbol $kw63$FREE_FORM;
    private static final SubLSymbol $kw64$MULTIPLE_FREE_FORM;
    private static final SubLString $str65$_a__;
    private static final SubLString $str66$Tip_;
    private static final SubLSymbol $sym67$LEXIFICATION_PARAMETERS;
    private static final SubLString $str68$Warning__;
    private static final SubLString $str69$____assertion_failed___a______;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD;
    private static final SubLString $str72$sme_lexwiz_html;
    private static final SubLString $str73$the__A;
    private static final SubLString $str74$_id;
    private static final SubLString $str75$cb_handle_sme_lexification_wizard;
    private static final SubLString $str76$_Specify_the_term_and_phrase_for_;
    private static final SubLString $str77$_cyc_term;
    private static final SubLString $str78$Complete;
    private static final SubLString $str79$Term__;
    private static final SubLInteger $int80$50;
    private static final SubLString $str81$Clear_Term;
    private static final SubLString $str82$_create_term;
    private static final SubLString $str83$Create_Term_;
    private static final SubLString $str84$Phrase__;
    private static final SubLString $str85$_phrase;
    private static final SubLInteger $int86$60;
    private static final SubLString $str87$Clear_Phrase;
    private static final SubLString $str88$Error__;
    private static final SubLString $str89$Reset;
    private static final SubLString $str90$_reset;
    private static final SubLInteger $int91$30;
    private static final SubLString $str92$Next_Lexification;
    private static final SubLString $str93$_next_action;
    private static final SubLString $str94$Skip_Lexification;
    private static final SubLString $str95$_skip_action;
    private static final SubLString $str96$_Reason__optional___;
    private static final SubLString $str97$_comment;
    private static final SubLString $str98$;
    private static final SubLInteger $int99$40;
    private static final SubLSymbol $sym100$CB_INVOKE_SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $kw101$HTML_HANDLER;
    private static final SubLString $str102$_Invoke_Lexification_Assistant_;
    private static final SubLString $str103$Note__For_more_control_over_the_l;
    private static final SubLSymbol $kw104$OE_LEXIFY_TERM;
    private static final SubLString $str105$sme_lexification_wizard;
    private static final SubLSymbol $kw106$MAIN;
    private static final SubLString $str107$cb_invoke_sme_lexification_wizard;
    private static final SubLSymbol $kw108$SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym109$CB_LINK_SME_LEXIFICATION_WIZARD;
    private static final SubLString $str110$SmeLex;
    private static final SubLString $str111$Perform_lexification_with_SME_lex;
    private static final SubLString $str112$Please_specify_a_valid_term;
    private static final SubLString $str113$Please_specify_a_phrase;
    private static final SubLSymbol $sym114$SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym115$NEW;
    private static final SubLSymbol $sym116$LEXWIZ_PARAMETERS;
    private static final SubLSymbol $sym117$LEXIFY;
    private static final SubLSymbol $sym118$CB_HANDLE_SME_LEXIFICATION_WIZARD;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$NOTIFY_CLIENT;
    private static final SubLSymbol $kw121$INPUT_READY;
    private static final SubLString $str122$Unable_to_resolve_question_into_u;
    private static final SubLSymbol $sym123$HANDLE_HTML_QUESTION_ANSWERING;
    private static final SubLString $str124$_br_;
    private static final SubLList $list125;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1347L)
    public static SubLObject subloop_reserved_initialize_html_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym5$OBJECT, (SubLObject)cb_sme_lexification_wizard.$sym6$INSTANCE_COUNT, (SubLObject)cb_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1347L)
    public static SubLObject subloop_reserved_initialize_html_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym5$OBJECT, (SubLObject)cb_sme_lexification_wizard.$sym8$ISOLATED_P, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym5$OBJECT, (SubLObject)cb_sme_lexification_wizard.$sym9$INSTANCE_NUMBER, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym10$ID, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym11$TITLE, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym12$QUESTION, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym13$TIP, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym14$QUESTION_TYPE, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym15$ERROR_MESSAGE, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym16$CHOICES, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym17$DESCRIPTIONS, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym18$VALUES, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym19$DEFAULT, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym20$ANSWER, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym21$FIELD_WIDTH, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym22$FIELD_LABELS, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym23$PROXY, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym24$CALLBACK_FUNCTION, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym25$CLIENT_DATA, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym26$USER_DATA, (SubLObject)cb_sme_lexification_wizard.NIL);
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1347L)
    public static SubLObject html_question_answering_agent_p(final SubLObject html_question_answering_agent) {
        return classes.subloop_instanceof_class(html_question_answering_agent, (SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1790L)
    public static SubLObject html_question_answering_agent_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.$str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_sme_lexification_wizard.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.$str32$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_sme_lexification_wizard.$kw33$UNINITIALIZED) ? ConsesLow.list(cb_sme_lexification_wizard.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            methods.funcall_instance_method_with_0_args(self, (SubLObject)cb_sme_lexification_wizard.$sym34$DISPLAY_QUESTION_PREAMBLE);
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sme_lexification_wizard.NIL);
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.$str35$post);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            if (cb_sme_lexification_wizard.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_hidden_input((SubLObject)cb_sme_lexification_wizard.$str36$handle_html_question_answering, (SubLObject)cb_sme_lexification_wizard.T, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_question_answering_agent_display_question_proper_method(self);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            methods.funcall_instance_method_with_0_args(self, (SubLObject)cb_sme_lexification_wizard.$sym37$DISPLAY_QUESTION_TRAILER);
            return (SubLObject)cb_sme_lexification_wizard.NIL;
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 2463L)
    public static SubLObject html_question_answering_agent_display_question_preamble_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_question_answering_agent_method = (SubLObject)cb_sme_lexification_wizard.NIL;
        final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
        try {
            thread.throwStack.push(cb_sme_lexification_wizard.$sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                final SubLObject title_$2 = sme_lexification_wizard.sme_lexwiz_title();
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title_$2);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_princ(title_$2);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.FOUR_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                cb_utilities.cb_help_preamble((SubLObject)cb_sme_lexification_wizard.$kw42$SME_LEXWIZ, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_princ(title);
                html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.FOUR_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)cb_sme_lexification_wizard.$sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, (SubLObject)cb_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_title(self, title);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_sme_lexification_wizard.$sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_question_answering_agent_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 3346L)
    public static SubLObject html_question_answering_agent_display_question_trailer_method(final SubLObject self) {
        html_utilities.html_copyright_notice();
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 3537L)
    public static SubLObject html_question_answering_agent_display_question_proper_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_question_answering_agent_method = (SubLObject)cb_sme_lexification_wizard.NIL;
        final SubLObject user_data = sme_lexification_wizard.get_question_answering_agent_user_data(self);
        final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels(self);
        final SubLObject field_width = sme_lexification_wizard.get_question_answering_agent_field_width(self);
        final SubLObject v_default = sme_lexification_wizard.get_question_answering_agent_default(self);
        final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values(self);
        final SubLObject descriptions = sme_lexification_wizard.get_question_answering_agent_descriptions(self);
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
        final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
        final SubLObject id = sme_lexification_wizard.get_question_answering_agent_id(self);
        try {
            thread.throwStack.push(cb_sme_lexification_wizard.$sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                if (cb_sme_lexification_wizard.NIL != error_message) {
                    final SubLObject color_val = (SubLObject)cb_sme_lexification_wizard.$kw49$RED;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (cb_sme_lexification_wizard.NIL != color_val) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_val));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                        html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str50$Error__);
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                        html_utilities.html_princ(error_message);
                        html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_encode_text(v_question));
                html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                html_utilities.html_hidden_input((SubLObject)cb_sme_lexification_wizard.$str51$_object_id, id, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                sme_lexification_wizard.set_object_data(id, self);
                final SubLObject pcase_var = question_type;
                if (pcase_var.eql((SubLObject)cb_sme_lexification_wizard.$kw52$BOOLEAN)) {
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_hidden_input((SubLObject)cb_sme_lexification_wizard.$str53$_positive_choice, sme_lexification_wizard.question_answering_agent_positive_choice_method(self), (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_submit_input(sme_lexification_wizard.question_answering_agent_positive_choice_method(self), (SubLObject)cb_sme_lexification_wizard.$str54$_yes, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_hidden_input((SubLObject)cb_sme_lexification_wizard.$str55$_negative_choice, sme_lexification_wizard.question_answering_agent_negative_choice_method(self), (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_submit_input(sme_lexification_wizard.question_answering_agent_negative_choice_method(self), (SubLObject)cb_sme_lexification_wizard.$str56$_no, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)cb_sme_lexification_wizard.$kw57$ENUMERATED)) {
                    final SubLObject listbox_size = Numbers.min(Sequences.length(choices), cb_sme_lexification_wizard.$max_sme_listbox_size$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    if (cb_sme_lexification_wizard.NIL != choices) {
                        html_utilities.html_create_radiobox_form((SubLObject)cb_sme_lexification_wizard.$str58$_response, choices, values, v_default, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    }
                    html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str59$OK, (SubLObject)cb_sme_lexification_wizard.$str60$_ok, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)cb_sme_lexification_wizard.$kw61$MULTIPLE_SELECTION)) {
                    final SubLObject listbox_size = Numbers.min(Sequences.length(choices), cb_sme_lexification_wizard.$max_sme_listbox_size$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.create_multiple_selection_listbox((SubLObject)cb_sme_lexification_wizard.$str58$_response, choices, values, listbox_size, v_default);
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str62$Submit, (SubLObject)cb_sme_lexification_wizard.$str60$_ok, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)cb_sme_lexification_wizard.$kw63$FREE_FORM)) {
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_text_input((SubLObject)cb_sme_lexification_wizard.$str58$_response, v_default, field_width);
                    html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str62$Submit, (SubLObject)cb_sme_lexification_wizard.$str60$_ok, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)cb_sme_lexification_wizard.$kw64$MULTIPLE_FREE_FORM)) {
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                        SubLObject list_var = (SubLObject)cb_sme_lexification_wizard.NIL;
                        SubLObject label = (SubLObject)cb_sme_lexification_wizard.NIL;
                        SubLObject i = (SubLObject)cb_sme_lexification_wizard.NIL;
                        list_var = field_labels;
                        label = list_var.first();
                        for (i = (SubLObject)cb_sme_lexification_wizard.ZERO_INTEGER; cb_sme_lexification_wizard.NIL != list_var; list_var = list_var.rest(), label = list_var.first(), i = Numbers.add((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER, i)) {
                            final SubLObject default_value = Sequences.elt(v_default, i);
                            final SubLObject optional_description = Sequences.elt(descriptions, i);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sme_lexification_wizard.$str65$_a__, label);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                                    html_utilities.html_text_input((SubLObject)cb_sme_lexification_wizard.$str58$_response, default_value, field_width);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                if (cb_sme_lexification_wizard.NIL != string_utilities.non_empty_stringP(optional_description)) {
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                                        html_utilities.html_princ(optional_description);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str62$Submit, (SubLObject)cb_sme_lexification_wizard.$str60$_ok, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                }
                html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                if (cb_sme_lexification_wizard.NIL != tip && cb_sme_lexification_wizard.NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread)) {
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str66$Tip_);
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                    html_utilities.html_markup(html_encode_text(tip));
                    html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                }
                final SubLObject lexwiz_parameters = user_data;
                if (Types.type_of(lexwiz_parameters) != cb_sme_lexification_wizard.$sym67$LEXIFICATION_PARAMETERS && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)cb_sme_lexification_wizard.$str68$Warning__, (SubLObject)cb_sme_lexification_wizard.$str69$____assertion_failed___a______), (SubLObject)cb_sme_lexification_wizard.$list70);
                    streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                add_oe_lexification_link(lexification_wizard.lexwiz_id(lexwiz_parameters));
                Dynamic.sublisp_throw((SubLObject)cb_sme_lexification_wizard.$sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, (SubLObject)cb_sme_lexification_wizard.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_user_data(self, user_data);
                    sme_lexification_wizard.set_question_answering_agent_field_labels(self, field_labels);
                    sme_lexification_wizard.set_question_answering_agent_field_width(self, field_width);
                    sme_lexification_wizard.set_question_answering_agent_default(self, v_default);
                    sme_lexification_wizard.set_question_answering_agent_values(self, values);
                    sme_lexification_wizard.set_question_answering_agent_descriptions(self, descriptions);
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_error_message(self, error_message);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    sme_lexification_wizard.set_question_answering_agent_tip(self, tip);
                    sme_lexification_wizard.set_question_answering_agent_question(self, v_question);
                    sme_lexification_wizard.set_question_answering_agent_id(self, id);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_sme_lexification_wizard.$sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_question_answering_agent_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 7495L)
    public static SubLObject cb_invoke_sme_lexification_wizard(SubLObject args) {
        if (args == cb_sme_lexification_wizard.UNPROVIDED) {
            args = (SubLObject)cb_sme_lexification_wizard.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sme_lexification_wizard.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn(PrintLow.format((SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.$str73$the__A, sme_lexification_wizard.sme_lexwiz_title()));
            return (SubLObject)cb_sme_lexification_wizard.NIL;
        }
        lexification_wizard.$sme_lexwiz_active$.setDynamicValue((SubLObject)cb_sme_lexification_wizard.T, thread);
        lexification_wizard.init_lexification_wizard((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        final SubLObject old_id = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str74$_id, args);
        final SubLObject old_object = lexification_wizard.get_lexification_object(old_id);
        final SubLObject default_params = (cb_sme_lexification_wizard.NIL != old_object) ? lexification_wizard.copy_lexification_parameters(old_object) : lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
        final SubLObject id = lexification_wizard.lexwiz_id(default_params);
        final SubLObject lex_term = misc_kb_utilities.coerce_name(lexification_wizard.lexwiz_term(default_params));
        final SubLObject cyc_term = lexification_utilities.lex_fort_for_string(lex_term);
        final SubLObject lex_phrase = lexification_utilities.string_for_field(lexification_wizard.lexwiz_phrase(default_params));
        lexification_wizard.trace_lexification_parameters(default_params, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.$str31$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_sme_lexification_wizard.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.$str32$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_sme_lexification_wizard.$kw33$UNINITIALIZED) ? ConsesLow.list(cb_sme_lexification_wizard.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(sme_lexification_wizard.sme_lexwiz_title());
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_sme_lexification_wizard.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_princ(sme_lexification_wizard.sme_lexwiz_title());
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    if (cb_sme_lexification_wizard.NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_sme_lexification_wizard.$str75$cb_handle_sme_lexification_wizard, (SubLObject)cb_sme_lexification_wizard.T, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.FOUR_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        cb_utilities.cb_help_preamble((SubLObject)cb_sme_lexification_wizard.$kw42$SME_LEXWIZ, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str76$_Specify_the_term_and_phrase_for_);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_sme_lexification_wizard.FOUR_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_sme_lexification_wizard.$str74$_id, id, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_complete.html_complete_button((SubLObject)cb_sme_lexification_wizard.$str77$_cyc_term, (SubLObject)cb_sme_lexification_wizard.$str78$Complete, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str79$Term__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                        html_utilities.html_text_input((SubLObject)cb_sme_lexification_wizard.$str77$_cyc_term, lex_term, (SubLObject)cb_sme_lexification_wizard.$int80$50);
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                        html_script_utilities.html_clear_input_button((SubLObject)cb_sme_lexification_wizard.$str77$_cyc_term, (SubLObject)cb_sme_lexification_wizard.$str81$Clear_Term, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        if (cb_sme_lexification_wizard.NIL == cyc_term && string_utilities.char_at(lex_term, (SubLObject)cb_sme_lexification_wizard.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_lparen)) {
                            html_utilities.html_checkbox_input((SubLObject)cb_sme_lexification_wizard.$str82$_create_term, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str83$Create_Term_);
                        }
                        html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        final SubLObject phrase_label = (SubLObject)cb_sme_lexification_wizard.$str84$Phrase__;
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ(phrase_label);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                        html_utilities.html_text_input((SubLObject)cb_sme_lexification_wizard.$str85$_phrase, lex_phrase, (SubLObject)cb_sme_lexification_wizard.$int86$60);
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                        html_script_utilities.html_clear_input_button((SubLObject)cb_sme_lexification_wizard.$str85$_phrase, (SubLObject)cb_sme_lexification_wizard.$str87$Clear_Phrase, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        if (cb_sme_lexification_wizard.NIL != lexification_wizard.lexwiz_error_message(default_params)) {
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            final SubLObject color_val = (SubLObject)cb_sme_lexification_wizard.$kw49$RED;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (cb_sme_lexification_wizard.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
                                html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str88$Error__);
                                html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
                                html_utilities.html_princ(lexification_wizard.lexwiz_error_message(default_params));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                        }
                        html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str89$Reset, (SubLObject)cb_sme_lexification_wizard.$str90$_reset, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str59$OK, (SubLObject)cb_sme_lexification_wizard.$str60$_ok, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_sme_lexification_wizard.$int91$30);
                        if (cb_sme_lexification_wizard.NIL != lexification_utilities.lex_empty_stringP(lex_term) && cb_sme_lexification_wizard.NIL != lexification_reminders.lexification_user_actions((SubLObject)cb_sme_lexification_wizard.UNPROVIDED)) {
                            html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str92$Next_Lexification, (SubLObject)cb_sme_lexification_wizard.$str93$_next_action, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        }
                        if (cb_sme_lexification_wizard.NIL != lexification_wizard.lexwiz_user_action(default_params)) {
                            html_utilities.html_submit_input((SubLObject)cb_sme_lexification_wizard.$str94$Skip_Lexification, (SubLObject)cb_sme_lexification_wizard.$str95$_skip_action, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sme_lexification_wizard.$str96$_Reason__optional___);
                            html_utilities.html_text_input((SubLObject)cb_sme_lexification_wizard.$str97$_comment, (SubLObject)cb_sme_lexification_wizard.$str98$, (SubLObject)cb_sme_lexification_wizard.$int99$40);
                        }
                        html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        if (cb_sme_lexification_wizard.NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread)) {
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str66$Tip_);
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER);
                            html_utilities.html_markup(html_encode_text(sme_lexification_wizard.phrase_specification_tip()));
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        }
                        add_oe_lexification_link(id);
                        if (cb_sme_lexification_wizard.NIL != cyc_term && cb_sme_lexification_wizard.NIL != lexification_wizard.$lexwiz_show_term_informationP$.getGlobalValue()) {
                            html_utilities.html_hr((SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            cb_browser.cb_print_documentation_information(cyc_term, (SubLObject)cb_sme_lexification_wizard.T);
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            cb_browser.cb_print_definitional_information(cyc_term);
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            cb_lexical_info.cb_print_lexical_information(cyc_term, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        return (SubLObject)cb_sme_lexification_wizard.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 11501L)
    public static SubLObject add_oe_lexification_link(final SubLObject lexwiz_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = lexification_wizard.resolve_lexwiz_object_fort(lexwiz_id);
        final SubLObject lexifier_link_text = (SubLObject)cb_sme_lexification_wizard.$str102$_Invoke_Lexification_Assistant_;
        if (cb_sme_lexification_wizard.NIL == lexification_utilities.is_relationalP(fort) || cb_sme_lexification_wizard.NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread)) {
            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str103$Note__For_more_control_over_the_l);
            cb_utilities.cb_link((SubLObject)cb_sme_lexification_wizard.$kw104$OE_LEXIFY_TERM, lexwiz_id, lexifier_link_text, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        }
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 12169L)
    public static SubLObject cb_link_sme_lexification_wizard(SubLObject linktext) {
        if (linktext == cb_sme_lexification_wizard.UNPROVIDED) {
            linktext = (SubLObject)cb_sme_lexification_wizard.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sme_lexification_wizard.NIL == linktext) {
            linktext = (SubLObject)cb_sme_lexification_wizard.$str105$sme_lexification_wizard;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sme_lexification_wizard.$kw106$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_sme_lexification_wizard.$str107$cb_invoke_sme_lexification_wizard);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        if (cb_sme_lexification_wizard.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sme_lexification_wizard.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 12534L)
    public static SubLObject cb_handle_sme_lexification_wizard(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str74$_id, args);
        final SubLObject default_params = lexification_wizard.get_lexification_object(id);
        final SubLObject lex_term = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str77$_cyc_term, args);
        SubLObject cyc_term = lexification_utilities.lex_fort_for_string(lex_term);
        final SubLObject create_termP = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str82$_create_term, args);
        final SubLObject is_relational_termP = lexification_utilities.is_relationalP(cyc_term);
        final SubLObject lex_mt = (cb_sme_lexification_wizard.NIL != is_relational_termP) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread);
        final SubLObject mt = lexification_utilities.lex_fort_for_string(lex_mt);
        final SubLObject lex_phrase = html_utilities.html_extract_string((SubLObject)cb_sme_lexification_wizard.$str85$_phrase, args, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        final SubLObject resetP = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str90$_reset, args);
        final SubLObject next_actionP = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str93$_next_action, args);
        final SubLObject skip_actionP = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str95$_skip_action, args);
        SubLObject re_invoke = (SubLObject)cb_sme_lexification_wizard.NIL;
        lexification_wizard._csetf_lexwiz_error_message(default_params, (SubLObject)cb_sme_lexification_wizard.NIL);
        if (cb_sme_lexification_wizard.NIL != resetP) {
            sme_lexification_wizard.reset_sme_lexification_parameters();
            return cb_invoke_sme_lexification_wizard((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        }
        if (cb_sme_lexification_wizard.NIL != next_actionP) {
            return lexification_reminders.lexify_next_user_action((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        }
        if (cb_sme_lexification_wizard.NIL != skip_actionP) {
            lexification_reminders.remove_lexification_user_action(default_params, lexification_wizard.lexwiz_user_action(default_params));
            final SubLObject result = lexification_reminders.lexify_next_user_action((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            return (cb_sme_lexification_wizard.NIL != result) ? result : cb_invoke_sme_lexification_wizard((SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        }
        if (cb_sme_lexification_wizard.NIL != create_termP) {
            cyc_term = misc_kb_utilities.find_or_create_nart_from_text(lex_term);
        }
        if (cb_sme_lexification_wizard.NIL != sme_lexification_wizard.$verify_beforehandP$.getGlobalValue()) {
            if (cb_sme_lexification_wizard.NIL == forts.fort_p(cyc_term)) {
                lexification_wizard._csetf_lexwiz_error_message(default_params, (SubLObject)cb_sme_lexification_wizard.$str112$Please_specify_a_valid_term);
            }
            if (cb_sme_lexification_wizard.NIL == string_utilities.non_empty_stringP(lex_phrase)) {
                lexification_wizard._csetf_lexwiz_error_message(default_params, (SubLObject)cb_sme_lexification_wizard.$str113$Please_specify_a_phrase);
            }
        }
        if (cb_sme_lexification_wizard.NIL != lexification_wizard.lexwiz_error_message(default_params)) {
            re_invoke = (SubLObject)cb_sme_lexification_wizard.T;
            lexification_wizard._csetf_lexwiz_term(default_params, lex_term);
            lexification_wizard._csetf_lexwiz_phrase(default_params, lex_phrase);
            lexification_wizard._csetf_lexwiz_mt(default_params, lex_mt);
        }
        else {
            final SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args((SubLObject)cb_sme_lexification_wizard.$sym114$SME_LEXIFICATION_WIZARD, (SubLObject)cb_sme_lexification_wizard.$sym115$NEW);
            instances.set_slot(sme_lexwiz, (SubLObject)cb_sme_lexification_wizard.$sym116$LEXWIZ_PARAMETERS, lexification_wizard.copy_lexification_parameters(default_params));
            methods.funcall_instance_method_with_3_args(sme_lexwiz, (SubLObject)cb_sme_lexification_wizard.$sym117$LEXIFY, cyc_term, lex_phrase, mt);
            sme_lexification_wizard.reset_sme_lexification_parameters();
        }
        return (SubLObject)((cb_sme_lexification_wizard.NIL != re_invoke) ? cb_invoke_sme_lexification_wizard(args) : cb_sme_lexification_wizard.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 15897L)
    public static SubLObject handle_html_question_answering(final SubLObject args) {
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str51$_object_id, args);
        final SubLObject html_question_object = sme_lexification_wizard.get_object_data(id);
        SubLObject response = html_utilities.html_extract_input_values((SubLObject)cb_sme_lexification_wizard.$str58$_response, args);
        final SubLObject positive_choice = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str53$_positive_choice, args);
        final SubLObject negative_choice = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str55$_negative_choice, args);
        final SubLObject yesP = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str54$_yes, args);
        final SubLObject noP = html_utilities.html_extract_input((SubLObject)cb_sme_lexification_wizard.$str56$_no, args);
        sme_lexification_wizard.lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), html_question_object);
        if (cb_sme_lexification_wizard.NIL == subl_promotions.memberP(instances.get_slot(html_question_object, (SubLObject)cb_sme_lexification_wizard.$sym14$QUESTION_TYPE), (SubLObject)cb_sme_lexification_wizard.$list119, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED)) {
            response = response.first();
        }
        if (cb_sme_lexification_wizard.NIL != yesP) {
            response = positive_choice;
        }
        if (cb_sme_lexification_wizard.NIL != noP) {
            response = negative_choice;
        }
        if (cb_sme_lexification_wizard.NIL != html_question_object) {
            instances.set_slot(html_question_object, (SubLObject)cb_sme_lexification_wizard.$sym10$ID, id);
            instances.set_slot(html_question_object, (SubLObject)cb_sme_lexification_wizard.$sym20$ANSWER, response);
            methods.funcall_instance_method_with_1_args(html_question_object, (SubLObject)cb_sme_lexification_wizard.$sym120$NOTIFY_CLIENT, (SubLObject)cb_sme_lexification_wizard.$kw121$INPUT_READY);
        }
        else {
            sme_lexwiz_error((SubLObject)cb_sme_lexification_wizard.$str122$Unable_to_resolve_question_into_u);
        }
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 17371L)
    public static SubLObject sme_lexwiz_error(final SubLObject message) {
        if (cb_sme_lexification_wizard.NIL != sme_lexification_wizard.sme_lexwiz_use_blackboardP()) {
            Errors.warn(message);
        }
        else {
            cb_utilities.cb_error(message, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
        }
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 17560L)
    public static SubLObject html_encode_text(SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hard_escapes = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_newline, (SubLObject)cb_sme_lexification_wizard.$str124$_br_), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_tab, cb_sme_lexification_wizard.$html_tab_expansion$.getGlobalValue()));
        final SubLObject soft_escapes = html_macros.$html_escapes_map$.getDynamicValue(thread);
        SubLObject cdolist_list_var = ConsesLow.append(soft_escapes, hard_escapes);
        SubLObject cons = (SubLObject)cb_sme_lexification_wizard.NIL;
        cons = cdolist_list_var.first();
        while (cb_sme_lexification_wizard.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject old_char = (SubLObject)cb_sme_lexification_wizard.NIL;
            SubLObject v_new = (SubLObject)cb_sme_lexification_wizard.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_sme_lexification_wizard.$list125);
            old_char = current.first();
            current = (v_new = current.rest());
            final SubLObject old = Strings.make_string((SubLObject)cb_sme_lexification_wizard.ONE_INTEGER, old_char);
            text = string_utilities.string_substitute(v_new, old, text, (SubLObject)cb_sme_lexification_wizard.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return text;
    }
    
    public static SubLObject declare_cb_sme_lexification_wizard_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "subloop_reserved_initialize_html_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "subloop_reserved_initialize_html_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "html_question_answering_agent_p", "HTML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "html_question_answering_agent_display_question_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "html_question_answering_agent_display_question_preamble_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "html_question_answering_agent_display_question_trailer_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "html_question_answering_agent_display_question_proper_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "cb_invoke_sme_lexification_wizard", "CB-INVOKE-SME-LEXIFICATION-WIZARD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "add_oe_lexification_link", "ADD-OE-LEXIFICATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "cb_link_sme_lexification_wizard", "CB-LINK-SME-LEXIFICATION-WIZARD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "cb_handle_sme_lexification_wizard", "CB-HANDLE-SME-LEXIFICATION-WIZARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "handle_html_question_answering", "HANDLE-HTML-QUESTION-ANSWERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "sme_lexwiz_error", "SME-LEXWIZ-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sme_lexification_wizard", "html_encode_text", "HTML-ENCODE-TEXT", 1, 0, false);
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    public static SubLObject init_cb_sme_lexification_wizard_file() {
        cb_sme_lexification_wizard.$sme_lexwiz_verboseP$ = SubLFiles.defvar("*SME-LEXWIZ-VERBOSE?*", (SubLObject)cb_sme_lexification_wizard.T);
        cb_sme_lexification_wizard.$html_tab_expansion$ = SubLFiles.defconstant("*HTML-TAB-EXPANSION*", (SubLObject)cb_sme_lexification_wizard.$str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb);
        cb_sme_lexification_wizard.$max_sme_listbox_size$ = SubLFiles.deflexical("*MAX-SME-LISTBOX-SIZE*", (SubLObject)cb_sme_lexification_wizard.FIFTEEN_INTEGER);
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    public static SubLObject setup_cb_sme_lexification_wizard_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_sme_lexification_wizard.$sym0$_SME_LEXWIZ_VERBOSE__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_sme_lexification_wizard.$sym0$_SME_LEXWIZ_VERBOSE__);
        classes.subloop_new_class((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym3$QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.$list4);
        classes.class_set_implements_slot_listeners((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym7$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC);
        subloop_reserved_initialize_html_question_answering_agent_class((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT);
        methods.methods_incorporate_instance_method((SubLObject)cb_sme_lexification_wizard.$sym28$DISPLAY_QUESTION, (SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$list29, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.$list30);
        methods.subloop_register_instance_method((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym28$DISPLAY_QUESTION, (SubLObject)cb_sme_lexification_wizard.$sym39$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cb_sme_lexification_wizard.$sym34$DISPLAY_QUESTION_PREAMBLE, (SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$list29, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.$list40);
        methods.subloop_register_instance_method((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym34$DISPLAY_QUESTION_PREAMBLE, (SubLObject)cb_sme_lexification_wizard.$sym43$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cb_sme_lexification_wizard.$sym37$DISPLAY_QUESTION_TRAILER, (SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$list29, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.$list44);
        methods.subloop_register_instance_method((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym37$DISPLAY_QUESTION_TRAILER, (SubLObject)cb_sme_lexification_wizard.$sym45$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cb_sme_lexification_wizard.$sym46$DISPLAY_QUESTION_PROPER, (SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$list29, (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)cb_sme_lexification_wizard.$list47);
        methods.subloop_register_instance_method((SubLObject)cb_sme_lexification_wizard.$sym2$HTML_QUESTION_ANSWERING_AGENT, (SubLObject)cb_sme_lexification_wizard.$sym46$DISPLAY_QUESTION_PROPER, (SubLObject)cb_sme_lexification_wizard.$sym71$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD);
        Hashtables.sethash((SubLObject)cb_sme_lexification_wizard.$kw42$SME_LEXWIZ, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_sme_lexification_wizard.$str72$sme_lexwiz_html, (SubLObject)cb_sme_lexification_wizard.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_sme_lexification_wizard.$sym100$CB_INVOKE_SME_LEXIFICATION_WIZARD, (SubLObject)cb_sme_lexification_wizard.$kw101$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sme_lexification_wizard.$kw108$SME_LEXIFICATION_WIZARD, (SubLObject)cb_sme_lexification_wizard.$sym109$CB_LINK_SME_LEXIFICATION_WIZARD, (SubLObject)cb_sme_lexification_wizard.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_sme_lexification_wizard.$kw108$SME_LEXIFICATION_WIZARD, sme_lexification_wizard.sme_lexwiz_title(), (SubLObject)cb_sme_lexification_wizard.$str110$SmeLex, (SubLObject)cb_sme_lexification_wizard.$str111$Perform_lexification_with_SME_lex);
        html_macros.note_cgi_handler_function((SubLObject)cb_sme_lexification_wizard.$sym118$CB_HANDLE_SME_LEXIFICATION_WIZARD, (SubLObject)cb_sme_lexification_wizard.$kw101$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sme_lexification_wizard.$sym123$HANDLE_HTML_QUESTION_ANSWERING, (SubLObject)cb_sme_lexification_wizard.$kw101$HTML_HANDLER);
        return (SubLObject)cb_sme_lexification_wizard.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_sme_lexification_wizard_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_sme_lexification_wizard_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_sme_lexification_wizard_file();
    }
    
    static {
        me = (SubLFile)new cb_sme_lexification_wizard();
        cb_sme_lexification_wizard.$sme_lexwiz_verboseP$ = null;
        cb_sme_lexification_wizard.$html_tab_expansion$ = null;
        cb_sme_lexification_wizard.$max_sme_listbox_size$ = null;
        $sym0$_SME_LEXWIZ_VERBOSE__ = SubLObjectFactory.makeSymbol("*SME-LEXWIZ-VERBOSE?*");
        $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb = SubLObjectFactory.makeString("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        $sym2$HTML_QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("HTML-QUESTION-ANSWERING-AGENT");
        $sym3$QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PREAMBLE"), (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PROPER"), (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-TRAILER"), (SubLObject)cb_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym5$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym6$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym7$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS");
        $sym8$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym9$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym10$ID = SubLObjectFactory.makeSymbol("ID");
        $sym11$TITLE = SubLObjectFactory.makeSymbol("TITLE");
        $sym12$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym13$TIP = SubLObjectFactory.makeSymbol("TIP");
        $sym14$QUESTION_TYPE = SubLObjectFactory.makeSymbol("QUESTION-TYPE");
        $sym15$ERROR_MESSAGE = SubLObjectFactory.makeSymbol("ERROR-MESSAGE");
        $sym16$CHOICES = SubLObjectFactory.makeSymbol("CHOICES");
        $sym17$DESCRIPTIONS = SubLObjectFactory.makeSymbol("DESCRIPTIONS");
        $sym18$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym19$DEFAULT = SubLObjectFactory.makeSymbol("DEFAULT");
        $sym20$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym21$FIELD_WIDTH = SubLObjectFactory.makeSymbol("FIELD-WIDTH");
        $sym22$FIELD_LABELS = SubLObjectFactory.makeSymbol("FIELD-LABELS");
        $sym23$PROXY = SubLObjectFactory.makeSymbol("PROXY");
        $sym24$CALLBACK_FUNCTION = SubLObjectFactory.makeSymbol("CALLBACK-FUNCTION");
        $sym25$CLIENT_DATA = SubLObjectFactory.makeSymbol("CLIENT-DATA");
        $sym26$USER_DATA = SubLObjectFactory.makeSymbol("USER-DATA");
        $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE");
        $sym28$DISPLAY_QUESTION = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-DOCUMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PREAMBLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-BASIC-FORM-HANDLER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("handle-html-question-answering")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PROPER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-TRAILER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cb_sme_lexification_wizard.NIL)));
        $str31$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str32$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw33$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym34$DISPLAY_QUESTION_PREAMBLE = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PREAMBLE");
        $str35$post = SubLObjectFactory.makeString("post");
        $str36$handle_html_question_answering = SubLObjectFactory.makeString("handle-html-question-answering");
        $sym37$DISPLAY_QUESTION_TRAILER = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-TRAILER");
        $sym38$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym39$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = SubLObjectFactory.makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SME-LEXWIZ-TITLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TITLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HEADING"), (SubLObject)ConsesLow.list((SubLObject)cb_sme_lexification_wizard.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HEADING"), (SubLObject)ConsesLow.list((SubLObject)cb_sme_lexification_wizard.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-HELP-PREAMBLE"), (SubLObject)SubLObjectFactory.makeKeyword("SME-LEXWIZ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)cb_sme_lexification_wizard.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cb_sme_lexification_wizard.NIL));
        $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD");
        $kw42$SME_LEXWIZ = SubLObjectFactory.makeKeyword("SME-LEXWIZ");
        $sym43$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD = SubLObjectFactory.makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-COPYRIGHT-NOTICE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cb_sme_lexification_wizard.NIL));
        $sym45$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD = SubLObjectFactory.makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD");
        $sym46$DISPLAY_QUESTION_PROPER = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PROPER");
        $list47 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FONT-COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Error: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)cb_sme_lexification_wizard.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)cb_sme_lexification_wizard.TWO_INTEGER))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-ENCODE-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HIDDEN-INPUT"), (SubLObject)SubLObjectFactory.makeString(":object-id"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-OBJECT-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HIDDEN-INPUT"), (SubLObject)SubLObjectFactory.makeString(":positive-choice"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeString(":yes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HIDDEN-INPUT"), (SubLObject)SubLObjectFactory.makeString(":negative-choice"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeString(":no"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENUMERATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTBOX-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")), (SubLObject)SubLObjectFactory.makeSymbol("*MAX-SME-LISTBOX-SIZE*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTBOX-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CREATE-RADIOBOX-FORM"), (SubLObject)SubLObjectFactory.makeString(":response"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("OK"), (SubLObject)SubLObjectFactory.makeString(":ok")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTBOX-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")), (SubLObject)SubLObjectFactory.makeSymbol("*MAX-SME-LISTBOX-SIZE*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-MULTIPLE-SELECTION-LISTBOX"), (SubLObject)SubLObjectFactory.makeString(":response"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTBOX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("Submit"), (SubLObject)SubLObjectFactory.makeString(":ok")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TEXT-INPUT"), (SubLObject)SubLObjectFactory.makeString(":response"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-WIDTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("Submit"), (SubLObject)SubLObjectFactory.makeString(":ok"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE"), (SubLObject)ConsesLow.list((SubLObject)cb_sme_lexification_wizard.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-LABELS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELT"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELT"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-ROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("~a: "), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TEXT-INPUT"), (SubLObject)SubLObjectFactory.makeString(":response"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-WIDTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-DESCRIPTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-DESCRIPTION")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SUBMIT-INPUT"), (SubLObject)SubLObjectFactory.makeString("Submit"), (SubLObject)SubLObjectFactory.makeString(":ok")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TIP"), (SubLObject)SubLObjectFactory.makeSymbol("*SME-LEXWIZ-VERBOSE?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)cb_sme_lexification_wizard.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Tip:")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)cb_sme_lexification_wizard.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-ENCODE-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TIP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)cb_sme_lexification_wizard.TWO_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("USER-DATA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)cb_sme_lexification_wizard.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFICATION-PARAMETERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-OE-LEXIFICATION-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-ID"), (SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cb_sme_lexification_wizard.NIL) });
        $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD");
        $kw49$RED = SubLObjectFactory.makeKeyword("RED");
        $str50$Error__ = SubLObjectFactory.makeString("Error: ");
        $str51$_object_id = SubLObjectFactory.makeString(":object-id");
        $kw52$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $str53$_positive_choice = SubLObjectFactory.makeString(":positive-choice");
        $str54$_yes = SubLObjectFactory.makeString(":yes");
        $str55$_negative_choice = SubLObjectFactory.makeString(":negative-choice");
        $str56$_no = SubLObjectFactory.makeString(":no");
        $kw57$ENUMERATED = SubLObjectFactory.makeKeyword("ENUMERATED");
        $str58$_response = SubLObjectFactory.makeString(":response");
        $str59$OK = SubLObjectFactory.makeString("OK");
        $str60$_ok = SubLObjectFactory.makeString(":ok");
        $kw61$MULTIPLE_SELECTION = SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION");
        $str62$Submit = SubLObjectFactory.makeString("Submit");
        $kw63$FREE_FORM = SubLObjectFactory.makeKeyword("FREE-FORM");
        $kw64$MULTIPLE_FREE_FORM = SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM");
        $str65$_a__ = SubLObjectFactory.makeString("~a: ");
        $str66$Tip_ = SubLObjectFactory.makeString("Tip:");
        $sym67$LEXIFICATION_PARAMETERS = SubLObjectFactory.makeSymbol("LEXIFICATION-PARAMETERS");
        $str68$Warning__ = SubLObjectFactory.makeString("Warning: ");
        $str69$____assertion_failed___a______ = SubLObjectFactory.makeString("*** assertion failed: ~a ***~%");
        $list70 = ConsesLow.list((SubLObject)cb_sme_lexification_wizard.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFICATION-PARAMETERS")));
        $sym71$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD = SubLObjectFactory.makeSymbol("HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD");
        $str72$sme_lexwiz_html = SubLObjectFactory.makeString("sme-lexwiz.html");
        $str73$the__A = SubLObjectFactory.makeString("the ~A");
        $str74$_id = SubLObjectFactory.makeString(":id");
        $str75$cb_handle_sme_lexification_wizard = SubLObjectFactory.makeString("cb-handle-sme-lexification-wizard");
        $str76$_Specify_the_term_and_phrase_for_ = SubLObjectFactory.makeString(" Specify the term and phrase for the lexical mapping");
        $str77$_cyc_term = SubLObjectFactory.makeString(":cyc-term");
        $str78$Complete = SubLObjectFactory.makeString("Complete");
        $str79$Term__ = SubLObjectFactory.makeString("Term :");
        $int80$50 = SubLObjectFactory.makeInteger(50);
        $str81$Clear_Term = SubLObjectFactory.makeString("Clear Term");
        $str82$_create_term = SubLObjectFactory.makeString(":create-term");
        $str83$Create_Term_ = SubLObjectFactory.makeString("Create Term?");
        $str84$Phrase__ = SubLObjectFactory.makeString("Phrase :");
        $str85$_phrase = SubLObjectFactory.makeString(":phrase");
        $int86$60 = SubLObjectFactory.makeInteger(60);
        $str87$Clear_Phrase = SubLObjectFactory.makeString("Clear Phrase");
        $str88$Error__ = SubLObjectFactory.makeString("Error :");
        $str89$Reset = SubLObjectFactory.makeString("Reset");
        $str90$_reset = SubLObjectFactory.makeString(":reset");
        $int91$30 = SubLObjectFactory.makeInteger(30);
        $str92$Next_Lexification = SubLObjectFactory.makeString("Next Lexification");
        $str93$_next_action = SubLObjectFactory.makeString(":next-action");
        $str94$Skip_Lexification = SubLObjectFactory.makeString("Skip Lexification");
        $str95$_skip_action = SubLObjectFactory.makeString(":skip-action");
        $str96$_Reason__optional___ = SubLObjectFactory.makeString(" Reason (optional): ");
        $str97$_comment = SubLObjectFactory.makeString(":comment");
        $str98$ = SubLObjectFactory.makeString("");
        $int99$40 = SubLObjectFactory.makeInteger(40);
        $sym100$CB_INVOKE_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("CB-INVOKE-SME-LEXIFICATION-WIZARD");
        $kw101$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str102$_Invoke_Lexification_Assistant_ = SubLObjectFactory.makeString("[Invoke Lexification Assistant]");
        $str103$Note__For_more_control_over_the_l = SubLObjectFactory.makeString("Note: For more control over the lexification, switch to the OE lexifier: ");
        $kw104$OE_LEXIFY_TERM = SubLObjectFactory.makeKeyword("OE-LEXIFY-TERM");
        $str105$sme_lexification_wizard = SubLObjectFactory.makeString("sme-lexification-wizard");
        $kw106$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str107$cb_invoke_sme_lexification_wizard = SubLObjectFactory.makeString("cb-invoke-sme-lexification-wizard");
        $kw108$SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeKeyword("SME-LEXIFICATION-WIZARD");
        $sym109$CB_LINK_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("CB-LINK-SME-LEXIFICATION-WIZARD");
        $str110$SmeLex = SubLObjectFactory.makeString("SmeLex");
        $str111$Perform_lexification_with_SME_lex = SubLObjectFactory.makeString("Perform lexification with SME lexwiz tool");
        $str112$Please_specify_a_valid_term = SubLObjectFactory.makeString("Please specify a valid term");
        $str113$Please_specify_a_phrase = SubLObjectFactory.makeString("Please specify a phrase");
        $sym114$SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("SME-LEXIFICATION-WIZARD");
        $sym115$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym116$LEXWIZ_PARAMETERS = SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS");
        $sym117$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym118$CB_HANDLE_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("CB-HANDLE-SME-LEXIFICATION-WIZARD");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION"), (SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM"));
        $sym120$NOTIFY_CLIENT = SubLObjectFactory.makeSymbol("NOTIFY-CLIENT");
        $kw121$INPUT_READY = SubLObjectFactory.makeKeyword("INPUT-READY");
        $str122$Unable_to_resolve_question_into_u = SubLObjectFactory.makeString("Unable to resolve question into underlying object");
        $sym123$HANDLE_HTML_QUESTION_ANSWERING = SubLObjectFactory.makeSymbol("HANDLE-HTML-QUESTION-ANSWERING");
        $str124$_br_ = SubLObjectFactory.makeString("<br>");
        $list125 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OLD-CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"));
    }
}

/*

	Total time: 377 ms
	
*/