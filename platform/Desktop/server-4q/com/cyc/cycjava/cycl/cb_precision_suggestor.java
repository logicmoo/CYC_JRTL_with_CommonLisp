package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_precision_suggestor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_precision_suggestor";
    public static final String myFingerPrint = "773b60199c8c1551ee8f991ade2297c66a7d5c38d5300f9ed0533ea4b8413812";
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLSymbol $dtp_cb_precision_suggestor_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 20833L)
    private static SubLSymbol $cb_current_precision_suggestion_implementation$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21290L)
    private static SubLSymbol $cb_precision_suggestion_implementations$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLSymbol $dtp_cb_precision_suggestor_rkf_state$;
    private static final SubLString $str0$_Precisify_;
    private static final SubLSymbol $kw1$SELF;
    private static final SubLString $str2$cb_precision_suggest__a;
    private static final SubLSymbol $kw3$PRECISION_SUGGEST;
    private static final SubLSymbol $sym4$CB_LINK_PRECISION_SUGGEST;
    private static final SubLString $str5$the_Cyc_KB_editing_facilities;
    private static final SubLList $list6;
    private static final SubLString $str7$_a_does_not_specify_an_assertion;
    private static final SubLSymbol $sym8$CB_PRECISION_SUGGEST;
    private static final SubLSymbol $kw9$HTML_HANDLER;
    private static final SubLString $str10$Precision_suggestor_done;
    private static final SubLSymbol $kw11$DONE;
    private static final SubLString $str12$Precision_Suggestor;
    private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw15$UNINITIALIZED;
    private static final SubLSymbol $kw16$CB_CYC;
    private static final SubLSymbol $kw17$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw18$SHA1;
    private static final SubLString $str19$yui_skin_sam;
    private static final SubLString $str20$reloadFrameButton;
    private static final SubLString $str21$button;
    private static final SubLString $str22$reload;
    private static final SubLString $str23$Refresh_Frames;
    private static final SubLString $str24$post;
    private static final SubLString $str25$cb_handle_precision_suggest;
    private static final SubLString $str26$stack_id;
    private static final SubLString $str27$state_id;
    private static final SubLString $str28$The_following_are_more_precise_ve;
    private static final SubLString $str29$_in_;
    private static final SubLString $str30$_;
    private static final SubLString $str31$Select_all_that_are_true__possibl;
    private static final SubLString $str32$_Warning___If_there_are_meta_asse;
    private static final SubLString $str33$Submit;
    private static final SubLString $str34$t;
    private static final SubLSymbol $sym35$CB_HANDLE_PRECISION_SUGGEST;
    private static final SubLString $str36$You_submitted_a_stale_Precision_S;
    private static final SubLSymbol $sym37$CB_PRECISION_SUGGESTOR_STATE_P;
    private static final SubLSymbol $sym38$CB_PRECISION_SUGGESTOR_STATE_STACK_P;
    private static final SubLSymbol $kw39$PRECISION_SUGGESTOR;
    private static final SubLString $str40$Precis;
    private static final SubLString $str41$Restart_the_Precision_Suggestor_t;
    private static final SubLString $str42$_Precis_;
    private static final SubLSymbol $kw43$MAIN;
    private static final SubLString $str44$cb_restart_precision_suggestor;
    private static final SubLSymbol $sym45$CB_LINK_PRECISION_SUGGESTOR;
    private static final SubLString $str46$the_Precision_Suggestor;
    private static final SubLSymbol $sym47$CB_RESTART_PRECISION_SUGGESTOR;
    private static final SubLString $str48$There_are_no_unfinished_Precision;
    private static final SubLSymbol $sym49$NON_EMPTY_LIST_P;
    private static final SubLSymbol $sym50$NON_DOTTED_LIST_P;
    private static final SubLString $str51$cb_handle_precision_suggestor_res;
    private static final SubLString $str52$Unfinished_sessions;
    private static final SubLString $str53$Resume_or_destroy_unfinished_Prec;
    private static final SubLString $str54$__A_total_;
    private static final SubLSymbol $kw55$DESTROY_ALL_PRECISION_SUGGEST;
    private static final SubLSymbol $kw56$LEFT;
    private static final SubLSymbol $kw57$TOP;
    private static final SubLString $str58$Actions;
    private static final SubLSymbol $kw59$RESUME_PRECISION_SUGGEST;
    private static final SubLSymbol $kw60$DESTROY_PRECISION_SUGGEST;
    private static final SubLString $str61$Original_assertion;
    private static final SubLString $str62$Current_formula;
    private static final SubLString $str63$Leaves;
    private static final SubLString $str64$_Resume_;
    private static final SubLString $str65$cb_resume_precision_suggest__a;
    private static final SubLSymbol $sym66$CB_LINK_RESUME_PRECISION_SUGGEST;
    private static final SubLString $str67$You_attempted_to_resume_a_Precisi;
    private static final SubLSymbol $sym68$CB_RESUME_PRECISION_SUGGEST;
    private static final SubLString $str69$_Destroy_;
    private static final SubLString $str70$cb_destroy_precision_suggest__a;
    private static final SubLSymbol $sym71$CB_LINK_DESTROY_PRECISION_SUGGEST;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$CB_DESTROY_PRECISION_SUGGEST;
    private static final SubLString $str74$_Destroy_All_;
    private static final SubLString $str75$cb_destroy_all_precision_suggest_;
    private static final SubLSymbol $sym76$CB_LINK_DESTROY_ALL_PRECISION_SUGGEST;
    private static final SubLSymbol $sym77$CB_DESTROY_ALL_PRECISION_SUGGEST;
    private static final SubLString $str78$None_;
    private static final SubLString $str79$Mt__;
    private static final SubLString $str80$Sentence__;
    private static final SubLSymbol $sym81$CB_PRECISION_SUGGESTOR_STATE;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$PRINT_CB_PRECISION_SUGGESTOR_STATE;
    private static final SubLSymbol $sym87$CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$CB_PSS_ORIGINAL_FORMULA;
    private static final SubLSymbol $sym90$_CSETF_CB_PSS_ORIGINAL_FORMULA;
    private static final SubLSymbol $sym91$CB_PSS_ORIGINAL_MT;
    private static final SubLSymbol $sym92$_CSETF_CB_PSS_ORIGINAL_MT;
    private static final SubLSymbol $sym93$CB_PSS_CURRENT_FORMULA;
    private static final SubLSymbol $sym94$_CSETF_CB_PSS_CURRENT_FORMULA;
    private static final SubLSymbol $sym95$CB_PSS_CURRENT_MT;
    private static final SubLSymbol $sym96$_CSETF_CB_PSS_CURRENT_MT;
    private static final SubLSymbol $sym97$CB_PSS_SUGGESTIONS;
    private static final SubLSymbol $sym98$_CSETF_CB_PSS_SUGGESTIONS;
    private static final SubLSymbol $sym99$CB_PSS_PRECISION_SUGGESTION_FUNCTION;
    private static final SubLSymbol $sym100$_CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION;
    private static final SubLSymbol $sym101$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION;
    private static final SubLSymbol $sym102$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION;
    private static final SubLSymbol $sym103$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE;
    private static final SubLSymbol $sym104$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE;
    private static final SubLSymbol $kw105$ORIGINAL_FORMULA;
    private static final SubLSymbol $kw106$ORIGINAL_MT;
    private static final SubLSymbol $kw107$CURRENT_FORMULA;
    private static final SubLSymbol $kw108$CURRENT_MT;
    private static final SubLSymbol $kw109$SUGGESTIONS;
    private static final SubLSymbol $kw110$PRECISION_SUGGESTION_FUNCTION;
    private static final SubLSymbol $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION;
    private static final SubLSymbol $kw112$IMPLEMENTATION_SPECIFIC_STATE;
    private static final SubLString $str113$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw114$BEGIN;
    private static final SubLSymbol $sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE;
    private static final SubLSymbol $kw116$SLOT;
    private static final SubLSymbol $kw117$END;
    private static final SubLSymbol $sym118$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD;
    private static final SubLString $str119$_S;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_;
    private static final SubLSymbol $kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION;
    private static final SubLSymbol $sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_;
    private static final SubLSymbol $sym124$CAR;
    private static final SubLSymbol $kw125$CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION;
    private static final SubLString $str126$OE_inference_based_implementation;
    private static final SubLSymbol $sym127$CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION;
    private static final SubLSymbol $sym128$CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE;
    private static final SubLSymbol $sym129$CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION;
    private static final SubLString $str130$keStrengtheningSuggestion;
    private static final SubLSymbol $sym131$_STRONG;
    private static final SubLObject $const132$and;
    private static final SubLObject $const133$True;
    private static final SubLList $list134;
    private static final SubLString $str135$RKF_implementation;
    private static final SubLSymbol $sym136$CB_RKF_PRECISION_SUGGESTION_FUNCTION;
    private static final SubLSymbol $sym137$CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE;
    private static final SubLSymbol $sym138$CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION;
    private static final SubLSymbol $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE;
    private static final SubLSymbol $sym140$CB_PRECISION_SUGGESTOR_RKF_STATE_P;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLList $list143;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym146$CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY;
    private static final SubLSymbol $sym149$_CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY;
    private static final SubLSymbol $sym150$CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY;
    private static final SubLSymbol $sym151$_CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY;
    private static final SubLSymbol $kw152$NEXT_ARG_TO_PRECISIFY;
    private static final SubLSymbol $kw153$NEXT_DIRECTION_TO_PRECISIFY;
    private static final SubLSymbol $sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE;
    private static final SubLSymbol $sym155$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD;
    private static final SubLSymbol $kw156$GENERALIZE;
    private static final SubLSymbol $kw157$SPECIALIZE;
    private static final SubLObject $const158$genls;
    private static final SubLSymbol $sym159$GENL_;
    private static final SubLSymbol $sym160$SPEC_;
    private static final SubLObject $const161$genlPreds;
    private static final SubLSymbol $sym162$GENL_PREDICATE_;
    private static final SubLSymbol $sym163$SPEC_PREDICATE_;
    private static final SubLSymbol $kw164$ASCENDING;
    private static final SubLSymbol $kw165$DESCENDING;
    private static final SubLSymbol $sym166$CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 1039L)
    public static SubLObject cb_link_precision_suggest(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_precision_suggestor.UNPROVIDED) {
            linktext = (SubLObject)cb_precision_suggestor.NIL;
        }
        if (disabledP == cb_precision_suggestor.UNPROVIDED) {
            disabledP = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_precision_suggestor.NIL == linktext) {
            linktext = (SubLObject)cb_precision_suggestor.$str0$_Precisify_;
        }
        if (cb_precision_suggestor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.$kw1$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_precision_suggestor.$str2$cb_precision_suggest__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            if (cb_precision_suggestor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 1430L)
    public static SubLObject cb_precision_suggest(final SubLObject args) {
        if (cb_precision_suggestor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_precision_suggestor.$str5$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id = (SubLObject)cb_precision_suggestor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_precision_suggestor.$list6);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_precision_suggestor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                if (cb_precision_suggestor.NIL == assertion_handles.assertion_p(assertion)) {
                    cb_utilities.cb_error((SubLObject)cb_precision_suggestor.$str7$_a_does_not_specify_an_assertion, id, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    return (SubLObject)cb_precision_suggestor.NIL;
                }
                cb_precision_suggest_assertion(assertion);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_precision_suggestor.$list6);
            }
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 1814L)
    public static SubLObject cb_precision_suggest_assertion(final SubLObject assertion) {
        final SubLObject formula = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject state = new_cb_precision_suggestor_initial_state(formula, mt);
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(state, stack);
        return cb_precision_suggest_next(stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 2120L)
    public static SubLObject cb_precision_suggest_next(final SubLObject cb_precision_suggestor_state_stack) {
        if (cb_precision_suggestor.NIL != stacks.stack_empty_p(cb_precision_suggestor_state_stack)) {
            cb_parameters.cb_glob_remove(cb_precision_suggestor_state_stack);
            return cb_utilities.cb_message_page_with_history((SubLObject)cb_precision_suggestor.$str10$Precision_suggestor_done, (SubLObject)cb_precision_suggestor.T);
        }
        final SubLObject state = stacks.stack_peek(cb_precision_suggestor_state_stack);
        final SubLObject pcase_var;
        final SubLObject suggestions = pcase_var = cb_generate_precision_suggestions(state);
        if (pcase_var.eql((SubLObject)cb_precision_suggestor.NIL)) {
            stacks.stack_pop(cb_precision_suggestor_state_stack);
            final SubLObject new_state = new_cb_precision_suggestor_state_if_suggestions_rejected(state);
            stacks.stack_push(new_state, cb_precision_suggestor_state_stack);
            return cb_precision_suggest_next(cb_precision_suggestor_state_stack);
        }
        if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw11$DONE)) {
            stacks.stack_pop(cb_precision_suggestor_state_stack);
            cb_precision_suggest_done(state);
            return cb_precision_suggest_next(cb_precision_suggestor_state_stack);
        }
        return cb_show_precision_suggestions(cb_precision_suggestor_state_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 3248L)
    public static SubLObject cb_precision_suggest_done(final SubLObject state) {
        final SubLObject current_formula = cb_pss_current_formula(state);
        final SubLObject current_mt = cb_pss_current_mt(state);
        final SubLObject original_formula = cb_pss_original_formula(state);
        final SubLObject original_mt = cb_pss_original_mt(state);
        if (!current_formula.equal(original_formula) || !current_mt.equal(original_mt)) {
            final SubLObject successP = ke.ke_assert_now(current_formula, current_mt, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            if (cb_precision_suggestor.NIL != successP) {
                final SubLObject original_assertion = kb_indexing.find_gaf(original_formula, original_mt);
                if (cb_precision_suggestor.NIL != original_assertion) {
                    ke.ke_unassert_assertion(original_assertion);
                }
                cb_tools.cb_add_sentence_in_mt_to_assertion_history(current_formula, current_mt);
            }
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 4232L)
    public static SubLObject cb_show_precision_suggestions(final SubLObject stack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject suggestions = cb_pss_suggestions(state);
        final SubLObject current_formula = cb_pss_current_formula(state);
        final SubLObject current_mt = cb_pss_current_mt(state);
        final SubLObject stack_id = cb_parameters.cb_glob_id(stack);
        final SubLObject state_id = cb_parameters.cb_glob_id(state);
        final SubLObject title_var = (SubLObject)cb_precision_suggestor.$str12$Precision_Suggestor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_precision_suggestor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_precision_suggestor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str14$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_precision_suggestor.$kw15$UNINITIALIZED) ? ConsesLow.list(cb_precision_suggestor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_precision_suggestor.$kw16$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_precision_suggestor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_precision_suggestor.$kw17$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_precision_suggestor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_precision_suggestor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str19$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str20$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str21$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str22$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str23$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            if (cb_precision_suggestor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_precision_suggestor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str24$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        if (cb_precision_suggestor.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_precision_suggestor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_precision_suggestor.$str25$cb_handle_precision_suggest, (SubLObject)cb_precision_suggestor.T, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_precision_suggestor.$str26$stack_id, stack_id, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_precision_suggestor.$str27$state_id, state_id, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str28$The_following_are_more_precise_ve);
                            html_utilities.html_newline((SubLObject)cb_precision_suggestor.UNPROVIDED);
                            cb_utilities.cb_form(current_formula, (SubLObject)cb_precision_suggestor.ZERO_INTEGER, (SubLObject)cb_precision_suggestor.T);
                            html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str29$_in_);
                            cb_utilities.cb_form(current_mt, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str30$_);
                            html_utilities.html_newline((SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str31$Select_all_that_are_true__possibl);
                            html_utilities.html_newline((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            if (cb_precision_suggestor.NIL != cb_precision_suggestor_state_possibly_initialP(state)) {
                                html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str32$_Warning___If_there_are_meta_asse);
                                html_utilities.html_newline((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            }
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                SubLObject bgcolor = (SubLObject)cb_precision_suggestor.NIL;
                                SubLObject color_toggle = (SubLObject)cb_precision_suggestor.NIL;
                                SubLObject list_var = (SubLObject)cb_precision_suggestor.NIL;
                                SubLObject suggestion = (SubLObject)cb_precision_suggestor.NIL;
                                SubLObject index = (SubLObject)cb_precision_suggestor.NIL;
                                list_var = suggestions;
                                suggestion = list_var.first();
                                for (index = (SubLObject)cb_precision_suggestor.ZERO_INTEGER; cb_precision_suggestor.NIL != list_var; list_var = list_var.rest(), suggestion = list_var.first(), index = Numbers.add((SubLObject)cb_precision_suggestor.ONE_INTEGER, index)) {
                                    if (cb_precision_suggestor.NIL != color_toggle) {
                                        color_toggle = (SubLObject)cb_precision_suggestor.NIL;
                                    }
                                    else {
                                        color_toggle = (SubLObject)cb_precision_suggestor.T;
                                    }
                                    bgcolor = ((cb_precision_suggestor.NIL != color_toggle) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (cb_precision_suggestor.NIL != bgcolor) {
                                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(bgcolor);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                            html_utilities.html_checkbox_input(string_utilities.to_string(index), (SubLObject)cb_precision_suggestor.T, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                            html_utilities.html_indent((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                            cb_utilities.cb_form(suggestion, (SubLObject)cb_precision_suggestor.ZERO_INTEGER, (SubLObject)cb_precision_suggestor.T);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_precision_suggestor.$str33$Submit, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 5821L)
    public static SubLObject cb_handle_precision_suggest(final SubLObject args) {
        final SubLObject stack_id = html_utilities.html_extract_input((SubLObject)cb_precision_suggestor.$str26$stack_id, args);
        final SubLObject stack = cb_parameters.cb_glob_lookup_by_string(stack_id);
        if (cb_precision_suggestor.NIL == stacks.stack_p(stack) || cb_precision_suggestor.NIL != stacks.stack_empty_p(stack)) {
            return cb_precision_suggestor_stale_page_submitted();
        }
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject state_id_expected = html_utilities.html_extract_input((SubLObject)cb_precision_suggestor.$str27$state_id, args);
        final SubLObject state_id_actual = cb_parameters.cb_glob_id(state);
        if (!state_id_actual.numE(string_utilities.string_to_integer(state_id_expected))) {
            return cb_precision_suggestor_stale_page_submitted();
        }
        stacks.stack_pop(stack);
        cb_parameters.cb_glob_remove_id(state_id_actual);
        final SubLObject suggestions = cb_pss_suggestions(state);
        SubLObject selected_suggestions = (SubLObject)cb_precision_suggestor.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject this_selectedP;
        for (cdotimes_end_var = Sequences.length(suggestions), i = (SubLObject)cb_precision_suggestor.NIL, i = (SubLObject)cb_precision_suggestor.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)cb_precision_suggestor.ONE_INTEGER)) {
            this_selectedP = html_utilities.html_extract_input(string_utilities.to_string(i), args);
            if (this_selectedP.equalp((SubLObject)cb_precision_suggestor.$str34$t)) {
                selected_suggestions = (SubLObject)ConsesLow.cons(ConsesLow.nth(i, suggestions), selected_suggestions);
            }
        }
        if (cb_precision_suggestor.NIL != list_utilities.empty_list_p(selected_suggestions)) {
            final SubLObject new_state = new_cb_precision_suggestor_state_if_suggestions_rejected(state);
            stacks.stack_push(new_state, stack);
        }
        else {
            SubLObject cdolist_list_var = selected_suggestions;
            SubLObject selected_suggestion = (SubLObject)cb_precision_suggestor.NIL;
            selected_suggestion = cdolist_list_var.first();
            while (cb_precision_suggestor.NIL != cdolist_list_var) {
                final SubLObject mt = cb_pss_current_mt(state);
                final SubLObject new_state2 = new_cb_precision_suggestor_state_for_selected_suggestion(state, selected_suggestion, mt);
                stacks.stack_push(new_state2, stack);
                cdolist_list_var = cdolist_list_var.rest();
                selected_suggestion = cdolist_list_var.first();
            }
        }
        return cb_precision_suggest_next(stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 7551L)
    public static SubLObject cb_precision_suggestor_stale_page_submitted() {
        return cb_utilities.cb_error((SubLObject)cb_precision_suggestor.$str36$You_submitted_a_stale_Precision_S, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 7799L)
    public static SubLObject cb_precision_suggestor_state_stack_p(final SubLObject v_object) {
        return stacks.stack_of_type_p(Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym37$CB_PRECISION_SUGGESTOR_STATE_P), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8041L)
    public static SubLObject cb_precision_suggestor_pending_stacks() {
        return cb_parameters.cb_glob_find_all_if(Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym38$CB_PRECISION_SUGGESTOR_STATE_STACK_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8419L)
    public static SubLObject cb_link_precision_suggestor(SubLObject linktext) {
        if (linktext == cb_precision_suggestor.UNPROVIDED) {
            linktext = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_precision_suggestor.NIL == linktext) {
            linktext = (SubLObject)cb_precision_suggestor.$str42$_Precis_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.$kw43$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str44$cb_restart_precision_suggestor);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        if (cb_precision_suggestor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8640L)
    public static SubLObject cb_restart_precision_suggestor(SubLObject args) {
        if (args == cb_precision_suggestor.UNPROVIDED) {
            args = (SubLObject)cb_precision_suggestor.NIL;
        }
        if (cb_precision_suggestor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_precision_suggestor.$str46$the_Precision_Suggestor);
        }
        else {
            cb_restart_precision_suggestor_internal();
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8861L)
    public static SubLObject cb_restart_precision_suggestor_internal() {
        final SubLObject v_stacks = cb_precision_suggestor_pending_stacks();
        if (cb_precision_suggestor.NIL != list_utilities.empty_list_p(v_stacks)) {
            return cb_utilities.cb_message_page_with_history((SubLObject)cb_precision_suggestor.$str48$There_are_no_unfinished_Precision, (SubLObject)cb_precision_suggestor.NIL);
        }
        return cb_restart_precision_suggestor_guts(v_stacks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 9224L)
    public static SubLObject cb_restart_precision_suggestor_guts(final SubLObject v_stacks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_precision_suggestor.NIL != list_utilities.non_empty_list_p(v_stacks) : v_stacks;
        assert cb_precision_suggestor.NIL != list_utilities.non_dotted_list_p(v_stacks) : v_stacks;
        SubLObject cdolist_list_var = v_stacks;
        SubLObject elem = (SubLObject)cb_precision_suggestor.NIL;
        elem = cdolist_list_var.first();
        while (cb_precision_suggestor.NIL != cdolist_list_var) {
            assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_stack_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject title_var = (SubLObject)cb_precision_suggestor.$str12$Precision_Suggestor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_precision_suggestor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_precision_suggestor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str14$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_precision_suggestor.$kw15$UNINITIALIZED) ? ConsesLow.list(cb_precision_suggestor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_precision_suggestor.$kw16$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_precision_suggestor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_precision_suggestor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_precision_suggestor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str19$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str20$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str21$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str22$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str23$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            if (cb_precision_suggestor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_precision_suggestor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        }
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_precision_suggestor.$str24$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        if (cb_precision_suggestor.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_precision_suggestor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_precision_suggestor.$str51$cb_handle_precision_suggestor_res, (SubLObject)cb_precision_suggestor.T, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            final SubLObject size_val = (SubLObject)cb_precision_suggestor.FOUR_INTEGER;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (cb_precision_suggestor.NIL != size_val) {
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                html_utilities.html_markup(size_val);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                cb_query.cb_princ_strong_with_explanation((SubLObject)cb_precision_suggestor.$str52$Unfinished_sessions, (SubLObject)cb_precision_suggestor.$str53$Resume_or_destroy_unfinished_Prec, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_indent((SubLObject)cb_precision_suggestor.FOUR_INTEGER);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_precision_suggestor.$str54$__A_total_, Sequences.length(v_stacks));
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_utilities.html_indent((SubLObject)cb_precision_suggestor.FOUR_INTEGER);
                            cb_utilities.cb_link((SubLObject)cb_precision_suggestor.$kw55$DESTROY_ALL_PRECISION_SUGGEST, v_stacks, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.ONE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_precision_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_precision_suggestor.$str58$Actions);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = (SubLObject)cb_precision_suggestor.NIL;
                                    stack = cdolist_list_var2.first();
                                    while (cb_precision_suggestor.NIL != cdolist_list_var2) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                            cb_utilities.cb_link((SubLObject)cb_precision_suggestor.$kw59$RESUME_PRECISION_SUGGEST, stack, (SubLObject)cb_precision_suggestor.NIL, stacks.stack_empty_p(stack), (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                            html_utilities.html_indent((SubLObject)cb_precision_suggestor.UNPROVIDED);
                                            cb_utilities.cb_link((SubLObject)cb_precision_suggestor.$kw60$DESTROY_PRECISION_SUGGEST, stack, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_precision_suggestor.$str61$Original_assertion);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = (SubLObject)cb_precision_suggestor.NIL;
                                    stack = cdolist_list_var2.first();
                                    while (cb_precision_suggestor.NIL != cdolist_list_var2) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                            cb_precision_suggestor_show_original_assertion(stack);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_precision_suggestor.$str62$Current_formula);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = (SubLObject)cb_precision_suggestor.NIL;
                                    stack = cdolist_list_var2.first();
                                    while (cb_precision_suggestor.NIL != cdolist_list_var2) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                            cb_precision_suggestor_show_current_formula(stack);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_precision_suggestor.$str63$Leaves);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = (SubLObject)cb_precision_suggestor.NIL;
                                    stack = cdolist_list_var2.first();
                                    while (cb_precision_suggestor.NIL != cdolist_list_var2) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw56$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_precision_suggestor.$kw57$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                                            html_utilities.html_princ(stacks.stack_size(stack));
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_precision_suggestor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 11108L)
    public static SubLObject cb_link_resume_precision_suggest(final SubLObject stack, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_precision_suggestor.UNPROVIDED) {
            linktext = (SubLObject)cb_precision_suggestor.NIL;
        }
        if (disabledP == cb_precision_suggestor.UNPROVIDED) {
            disabledP = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_precision_suggestor.NIL == linktext) {
            linktext = (SubLObject)cb_precision_suggestor.$str64$_Resume_;
        }
        if (cb_precision_suggestor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.$kw1$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_precision_suggestor.$str65$cb_resume_precision_suggest__a, cb_parameters.cb_glob_id(stack));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            if (cb_precision_suggestor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 11436L)
    public static SubLObject cb_resume_precision_suggest(final SubLObject args) {
        SubLObject id = (SubLObject)cb_precision_suggestor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_precision_suggestor.$list6);
        id = args.first();
        final SubLObject current = args.rest();
        if (cb_precision_suggestor.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_precision_suggestor.$list6);
            return (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLObject stack = cb_parameters.cb_glob_lookup_by_string(id);
        if (cb_precision_suggestor.NIL == stacks.stack_p(stack) || cb_precision_suggestor.NIL != stacks.stack_empty_p(stack)) {
            return cb_utilities.cb_error((SubLObject)cb_precision_suggestor.$str67$You_attempted_to_resume_a_Precisi, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        }
        return cb_show_precision_suggestions(stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 11792L)
    public static SubLObject cb_link_destroy_precision_suggest(final SubLObject stack, SubLObject linktext) {
        if (linktext == cb_precision_suggestor.UNPROVIDED) {
            linktext = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_precision_suggestor.NIL == linktext) {
            linktext = (SubLObject)cb_precision_suggestor.$str69$_Destroy_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.$kw1$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_precision_suggestor.$str70$cb_destroy_precision_suggest__a, cb_parameters.cb_glob_id(stack));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        if (cb_precision_suggestor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 12058L)
    public static SubLObject cb_destroy_precision_suggest(final SubLObject args) {
        SubLObject id_as_string = (SubLObject)cb_precision_suggestor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_precision_suggestor.$list72);
        id_as_string = args.first();
        final SubLObject current = args.rest();
        if (cb_precision_suggestor.NIL == current) {
            final SubLObject id = string_utilities.string_to_integer(id_as_string);
            final SubLObject stack = cb_parameters.cb_glob_lookup(id);
            cb_parameters.cb_glob_remove_id(id);
            stacks.clear_stack(stack);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_precision_suggestor.$list72);
        }
        return cb_restart_precision_suggestor_internal();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 12578L)
    public static SubLObject cb_link_destroy_all_precision_suggest(final SubLObject v_stacks, SubLObject linktext) {
        if (linktext == cb_precision_suggestor.UNPROVIDED) {
            linktext = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_precision_suggestor.NIL == linktext) {
            linktext = (SubLObject)cb_precision_suggestor.$str74$_Destroy_All_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_precision_suggestor.$kw1$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_precision_suggestor.$str75$cb_destroy_all_precision_suggest_, cb_parameters.cb_glob_id(v_stacks));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        if (cb_precision_suggestor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_precision_suggestor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_stacks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 12859L)
    public static SubLObject cb_destroy_all_precision_suggest(final SubLObject args) {
        SubLObject id_as_string = (SubLObject)cb_precision_suggestor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_precision_suggestor.$list72);
        id_as_string = args.first();
        final SubLObject current = args.rest();
        if (cb_precision_suggestor.NIL == current) {
            final SubLObject id = string_utilities.string_to_integer(id_as_string);
            final SubLObject v_stacks = cb_parameters.cb_glob_lookup(id);
            cb_parameters.cb_glob_remove_id(id);
            SubLObject cdolist_list_var = v_stacks;
            SubLObject stack = (SubLObject)cb_precision_suggestor.NIL;
            stack = cdolist_list_var.first();
            while (cb_precision_suggestor.NIL != cdolist_list_var) {
                cb_parameters.cb_glob_remove(stack);
                cdolist_list_var = cdolist_list_var.rest();
                stack = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_precision_suggestor.$list72);
        }
        return cb_utilities.cb_message_page_with_history((SubLObject)cb_precision_suggestor.$str10$Precision_suggestor_done, (SubLObject)cb_precision_suggestor.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 13202L)
    public static SubLObject cb_precision_suggestor_show_original_assertion(final SubLObject stack) {
        if (cb_precision_suggestor.NIL != stacks.stack_empty_p(stack)) {
            return html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str78$None_);
        }
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject original_formula = cb_pss_original_formula(state);
        final SubLObject original_mt = cb_pss_original_mt(state);
        return cb_precision_suggestor_show_formula(original_formula, original_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 13563L)
    public static SubLObject cb_precision_suggestor_show_current_formula(final SubLObject stack) {
        if (cb_precision_suggestor.NIL != stacks.stack_empty_p(stack)) {
            return html_utilities.html_princ((SubLObject)cb_precision_suggestor.$str78$None_);
        }
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject current_formula = cb_pss_current_formula(state);
        final SubLObject current_mt = cb_pss_current_mt(state);
        return cb_precision_suggestor_show_formula(current_formula, current_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 13915L)
    public static SubLObject cb_precision_suggestor_show_formula(final SubLObject sentence, final SubLObject mt) {
        html_utilities.html_princ_strong((SubLObject)cb_precision_suggestor.$str79$Mt__);
        html_utilities.html_indent((SubLObject)cb_precision_suggestor.UNPROVIDED);
        cb_utilities.cb_form(mt, (SubLObject)cb_precision_suggestor.ZERO_INTEGER, (SubLObject)cb_precision_suggestor.NIL);
        html_utilities.html_newline((SubLObject)cb_precision_suggestor.UNPROVIDED);
        html_utilities.html_princ_strong((SubLObject)cb_precision_suggestor.$str80$Sentence__);
        html_utilities.html_newline((SubLObject)cb_precision_suggestor.UNPROVIDED);
        cb_utilities.cb_form(sentence, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_precision_suggestor_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cb_precision_suggestor_state(v_object, stream, (SubLObject)cb_precision_suggestor.ZERO_INTEGER);
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_precision_suggestor_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cb_precision_suggestor_state_native.class) ? cb_precision_suggestor.T : cb_precision_suggestor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_original_formula(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_original_mt(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_current_formula(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_current_mt(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_suggestions(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_precision_suggestion_function(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_implementation_specific_state_update_function(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject cb_pss_implementation_specific_state(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_original_formula(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_original_mt(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_current_formula(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_current_mt(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_suggestions(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_precision_suggestion_function(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_implementation_specific_state_update_function(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject _csetf_cb_pss_implementation_specific_state(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject make_cb_precision_suggestor_state(SubLObject arglist) {
        if (arglist == cb_precision_suggestor.UNPROVIDED) {
            arglist = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cb_precision_suggestor_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_precision_suggestor.NIL, next = arglist; cb_precision_suggestor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw105$ORIGINAL_FORMULA)) {
                _csetf_cb_pss_original_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw106$ORIGINAL_MT)) {
                _csetf_cb_pss_original_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw107$CURRENT_FORMULA)) {
                _csetf_cb_pss_current_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw108$CURRENT_MT)) {
                _csetf_cb_pss_current_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw109$SUGGESTIONS)) {
                _csetf_cb_pss_suggestions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw110$PRECISION_SUGGESTION_FUNCTION)) {
                _csetf_cb_pss_precision_suggestion_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION)) {
                _csetf_cb_pss_implementation_specific_state_update_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw112$IMPLEMENTATION_SPECIFIC_STATE)) {
                _csetf_cb_pss_implementation_specific_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_precision_suggestor.$str113$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject visit_defstruct_cb_precision_suggestor_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw114$BEGIN, (SubLObject)cb_precision_suggestor.$sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE, (SubLObject)cb_precision_suggestor.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw105$ORIGINAL_FORMULA, cb_pss_original_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw106$ORIGINAL_MT, cb_pss_original_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw107$CURRENT_FORMULA, cb_pss_current_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw108$CURRENT_MT, cb_pss_current_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw109$SUGGESTIONS, cb_pss_suggestions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw110$PRECISION_SUGGESTION_FUNCTION, cb_pss_precision_suggestion_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, cb_pss_implementation_specific_state_update_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw112$IMPLEMENTATION_SPECIFIC_STATE, cb_pss_implementation_specific_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw117$END, (SubLObject)cb_precision_suggestor.$sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE, (SubLObject)cb_precision_suggestor.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
    public static SubLObject visit_defstruct_object_cb_precision_suggestor_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_precision_suggestor_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 15740L)
    public static SubLObject print_cb_precision_suggestor_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = cb_pss_current_formula(v_object);
        if (cb_precision_suggestor.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)cb_precision_suggestor.T, (SubLObject)cb_precision_suggestor.T);
            PrintLow.format(stream, (SubLObject)cb_precision_suggestor.$str119$_S, formula);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)cb_precision_suggestor.T, (SubLObject)cb_precision_suggestor.T);
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 15998L)
    public static SubLObject cb_precision_suggestor_state_possibly_initialP(final SubLObject cb_precision_suggestor_state) {
        final SubLObject current_formula = cb_pss_current_formula(cb_precision_suggestor_state);
        final SubLObject current_mt = cb_pss_current_mt(cb_precision_suggestor_state);
        final SubLObject original_formula = cb_pss_original_formula(cb_precision_suggestor_state);
        final SubLObject original_mt = cb_pss_original_mt(cb_precision_suggestor_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(current_formula.equal(original_formula) && current_mt.equal(original_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 16509L)
    public static SubLObject cb_generate_precision_suggestions(final SubLObject cb_precision_suggestor_state) {
        final SubLObject precision_suggestion_function = cb_pss_precision_suggestion_function(cb_precision_suggestor_state);
        final SubLObject suggestions = Functions.funcall(precision_suggestion_function, cb_precision_suggestor_state);
        _csetf_cb_pss_suggestions(cb_precision_suggestor_state, suggestions);
        return suggestions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 17128L)
    public static SubLObject new_cb_precision_suggestor_initial_state(final SubLObject formula, final SubLObject mt) {
        SubLObject current;
        final SubLObject datum = current = cb_current_precision_suggestion_implementation_properties();
        SubLObject name = (SubLObject)cb_precision_suggestor.NIL;
        SubLObject precision_suggestion_function = (SubLObject)cb_precision_suggestor.NIL;
        SubLObject initial_implementation_specific_state_function = (SubLObject)cb_precision_suggestor.NIL;
        SubLObject implementation_specific_state_update_function = (SubLObject)cb_precision_suggestor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_precision_suggestor.$list120);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_precision_suggestor.$list120);
        precision_suggestion_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_precision_suggestor.$list120);
        initial_implementation_specific_state_function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_precision_suggestor.$list120);
        implementation_specific_state_update_function = current.first();
        current = current.rest();
        if (cb_precision_suggestor.NIL == current) {
            final SubLObject implementation_specific_state = Functions.funcall(initial_implementation_specific_state_function);
            return make_cb_precision_suggestor_state((SubLObject)ConsesLow.list(new SubLObject[] { cb_precision_suggestor.$kw105$ORIGINAL_FORMULA, formula, cb_precision_suggestor.$kw106$ORIGINAL_MT, mt, cb_precision_suggestor.$kw107$CURRENT_FORMULA, formula, cb_precision_suggestor.$kw108$CURRENT_MT, mt, cb_precision_suggestor.$kw110$PRECISION_SUGGESTION_FUNCTION, precision_suggestion_function, cb_precision_suggestor.$kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, implementation_specific_state_update_function, cb_precision_suggestor.$kw112$IMPLEMENTATION_SPECIFIC_STATE, implementation_specific_state }));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_precision_suggestor.$list120);
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 17943L)
    public static SubLObject new_cb_precision_suggestor_state_for_selected_suggestion(final SubLObject old_cb_precision_suggestor_state, final SubLObject formula, final SubLObject mt) {
        final SubLObject new_original_formula = cb_pss_original_formula(old_cb_precision_suggestor_state);
        final SubLObject new_original_mt = cb_pss_original_mt(old_cb_precision_suggestor_state);
        final SubLObject new_precision_suggestion_function = cb_pss_precision_suggestion_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state_update_function = cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state = Functions.funcall(cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state), old_cb_precision_suggestor_state, (SubLObject)cb_precision_suggestor.T);
        return make_cb_precision_suggestor_state((SubLObject)ConsesLow.list(new SubLObject[] { cb_precision_suggestor.$kw105$ORIGINAL_FORMULA, new_original_formula, cb_precision_suggestor.$kw106$ORIGINAL_MT, new_original_mt, cb_precision_suggestor.$kw107$CURRENT_FORMULA, formula, cb_precision_suggestor.$kw108$CURRENT_MT, mt, cb_precision_suggestor.$kw110$PRECISION_SUGGESTION_FUNCTION, new_precision_suggestion_function, cb_precision_suggestor.$kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, new_implementation_specific_state_update_function, cb_precision_suggestor.$kw112$IMPLEMENTATION_SPECIFIC_STATE, new_implementation_specific_state }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 19338L)
    public static SubLObject new_cb_precision_suggestor_state_if_suggestions_rejected(final SubLObject old_cb_precision_suggestor_state) {
        final SubLObject new_original_formula = cb_pss_original_formula(old_cb_precision_suggestor_state);
        final SubLObject new_original_mt = cb_pss_original_mt(old_cb_precision_suggestor_state);
        final SubLObject new_current_formula = cb_pss_current_formula(old_cb_precision_suggestor_state);
        final SubLObject new_current_mt = cb_pss_current_mt(old_cb_precision_suggestor_state);
        final SubLObject new_precision_suggestion_function = cb_pss_precision_suggestion_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state_update_function = cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state = Functions.funcall(cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state), old_cb_precision_suggestor_state, (SubLObject)cb_precision_suggestor.NIL);
        return make_cb_precision_suggestor_state((SubLObject)ConsesLow.list(new SubLObject[] { cb_precision_suggestor.$kw105$ORIGINAL_FORMULA, new_original_formula, cb_precision_suggestor.$kw106$ORIGINAL_MT, new_original_mt, cb_precision_suggestor.$kw107$CURRENT_FORMULA, new_current_formula, cb_precision_suggestor.$kw108$CURRENT_MT, new_current_mt, cb_precision_suggestor.$kw110$PRECISION_SUGGESTION_FUNCTION, new_precision_suggestion_function, cb_precision_suggestor.$kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, new_implementation_specific_state_update_function, cb_precision_suggestor.$kw112$IMPLEMENTATION_SPECIFIC_STATE, new_implementation_specific_state }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21102L)
    public static SubLObject cb_current_precision_suggestion_implementation_properties() {
        return cb_precision_suggestion_implementation_properties(cb_precision_suggestor.$cb_current_precision_suggestion_implementation$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21449L)
    public static SubLObject cb_precision_suggestion_implementations() {
        return conses_high.copy_list(cb_precision_suggestor.$cb_precision_suggestion_implementations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21574L)
    public static SubLObject cb_precision_suggestion_implementation_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cb_precision_suggestor.$cb_precision_suggestion_implementations$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_precision_suggestor.EQL), Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym124$CAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21721L)
    public static SubLObject cb_precision_suggestion_implementation_properties(final SubLObject implementation) {
        return list_utilities.alist_lookup(cb_precision_suggestor.$cb_precision_suggestion_implementations$.getGlobalValue(), implementation, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21888L)
    public static SubLObject declare_cb_precision_suggestion_implementation(final SubLObject implementation, final SubLObject name, final SubLObject precision_suggestion_function, final SubLObject initial_implementation_specific_state_function, final SubLObject implementation_specific_state_update_function) {
        undeclare_cb_precision_suggestion_implementation(implementation);
        cb_precision_suggestor.$cb_precision_suggestion_implementations$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(implementation, (SubLObject)ConsesLow.list(name, precision_suggestion_function, initial_implementation_specific_state_function, implementation_specific_state_update_function)), cb_precision_suggestor.$cb_precision_suggestion_implementations$.getGlobalValue()));
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 23307L)
    public static SubLObject undeclare_cb_precision_suggestion_implementation(final SubLObject implementation) {
        cb_precision_suggestor.$cb_precision_suggestion_implementations$.setGlobalValue(Sequences.delete(implementation, cb_precision_suggestor.$cb_precision_suggestion_implementations$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_precision_suggestor.EQL), Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym124$CAR), (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED));
        return implementation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 23979L)
    public static SubLObject cb_inference_precision_suggestion_function(final SubLObject cb_precision_suggestor_state) {
        final SubLObject inference_state = cb_pss_implementation_specific_state(cb_precision_suggestor_state);
        final SubLObject formula = cb_pss_current_formula(cb_precision_suggestor_state);
        final SubLObject mt = cb_pss_current_mt(cb_precision_suggestor_state);
        return (SubLObject)((cb_precision_suggestor.NIL != inference_state) ? inference_precision_suggest(formula, mt) : cb_precision_suggestor.$kw11$DONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 24383L)
    public static SubLObject inference_precision_suggest(final SubLObject formula, final SubLObject mt) {
        final SubLObject pred = constants_high.find_constant((SubLObject)cb_precision_suggestor.$str130$keStrengtheningSuggestion);
        if (cb_precision_suggestor.NIL != constant_handles.valid_constantP(pred, (SubLObject)cb_precision_suggestor.UNPROVIDED)) {
            return ask_utilities.query_variable((SubLObject)cb_precision_suggestor.$sym131$_STRONG, el_utilities.make_ternary_formula(cb_precision_suggestor.$const132$and, el_utilities.make_binary_formula(pred, formula, (SubLObject)cb_precision_suggestor.$sym131$_STRONG), cb_precision_suggestor.$const133$True, cb_precision_suggestor.$const133$True), mt, (SubLObject)cb_precision_suggestor.$list134);
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 24867L)
    public static SubLObject cb_precision_suggestor_initial_inference_state() {
        return (SubLObject)cb_precision_suggestor.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 24945L)
    public static SubLObject cb_precision_suggestor_inference_state_update_function(final SubLObject old_cb_precision_suggestor_state, final SubLObject suggestion_acceptedP) {
        return list_utilities.sublisp_boolean(suggestion_acceptedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 25655L)
    public static SubLObject cb_rkf_precision_suggestion_function(final SubLObject cb_precision_suggestor_state) {
        final SubLObject rkf_state = cb_pss_implementation_specific_state(cb_precision_suggestor_state);
        final SubLObject formula = cb_pss_current_formula(cb_precision_suggestor_state);
        final SubLObject mt = cb_pss_current_mt(cb_precision_suggestor_state);
        final SubLObject argnum = cb_ps_rkf_s_next_arg_to_precisify(rkf_state);
        final SubLObject direction = cb_ps_rkf_s_next_direction_to_precisify(rkf_state);
        if (cb_precision_suggestor.NIL == argnum) {
            return (SubLObject)cb_precision_suggestor.$kw11$DONE;
        }
        return cb_precisify_argument_candidates(formula, mt, argnum, direction, (SubLObject)cb_precision_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject cb_precision_suggestor_rkf_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)cb_precision_suggestor.ZERO_INTEGER);
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject cb_precision_suggestor_rkf_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cb_precision_suggestor_rkf_state_native.class) ? cb_precision_suggestor.T : cb_precision_suggestor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject cb_ps_rkf_s_next_arg_to_precisify(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_rkf_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject cb_ps_rkf_s_next_direction_to_precisify(final SubLObject v_object) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_rkf_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject _csetf_cb_ps_rkf_s_next_arg_to_precisify(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_rkf_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject _csetf_cb_ps_rkf_s_next_direction_to_precisify(final SubLObject v_object, final SubLObject value) {
        assert cb_precision_suggestor.NIL != cb_precision_suggestor_rkf_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject make_cb_precision_suggestor_rkf_state(SubLObject arglist) {
        if (arglist == cb_precision_suggestor.UNPROVIDED) {
            arglist = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cb_precision_suggestor_rkf_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_precision_suggestor.NIL, next = arglist; cb_precision_suggestor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw152$NEXT_ARG_TO_PRECISIFY)) {
                _csetf_cb_ps_rkf_s_next_arg_to_precisify(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_precision_suggestor.$kw153$NEXT_DIRECTION_TO_PRECISIFY)) {
                _csetf_cb_ps_rkf_s_next_direction_to_precisify(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_precision_suggestor.$str113$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject visit_defstruct_cb_precision_suggestor_rkf_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw114$BEGIN, (SubLObject)cb_precision_suggestor.$sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE, (SubLObject)cb_precision_suggestor.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw152$NEXT_ARG_TO_PRECISIFY, cb_ps_rkf_s_next_arg_to_precisify(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw116$SLOT, (SubLObject)cb_precision_suggestor.$kw153$NEXT_DIRECTION_TO_PRECISIFY, cb_ps_rkf_s_next_direction_to_precisify(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_precision_suggestor.$kw117$END, (SubLObject)cb_precision_suggestor.$sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE, (SubLObject)cb_precision_suggestor.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
    public static SubLObject visit_defstruct_object_cb_precision_suggestor_rkf_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_precision_suggestor_rkf_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26326L)
    public static SubLObject cb_precision_suggestor_initial_rkf_state() {
        return make_cb_precision_suggestor_rkf_state((SubLObject)ConsesLow.list((SubLObject)cb_precision_suggestor.$kw152$NEXT_ARG_TO_PRECISIFY, (SubLObject)cb_precision_suggestor.ONE_INTEGER, (SubLObject)cb_precision_suggestor.$kw153$NEXT_DIRECTION_TO_PRECISIFY, (SubLObject)cb_precision_suggestor.$kw156$GENERALIZE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26526L)
    public static SubLObject cb_precision_suggestor_rkf_state_update_function(final SubLObject old_cb_precision_suggestor_state, final SubLObject suggestion_acceptedP) {
        final SubLObject old_rkf_state = cb_pss_implementation_specific_state(old_cb_precision_suggestor_state);
        if (cb_precision_suggestor.NIL != suggestion_acceptedP) {
            return copy_cb_precision_suggestor_rkf_state(old_rkf_state);
        }
        final SubLObject formula = cb_pss_current_formula(old_cb_precision_suggestor_state);
        final SubLObject v_arity = el_utilities.formula_arity(formula, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        final SubLObject old_next_arg_to_precisify = cb_ps_rkf_s_next_arg_to_precisify(old_rkf_state);
        final SubLObject old_next_direction_to_precisify = cb_ps_rkf_s_next_direction_to_precisify(old_rkf_state);
        final SubLObject new_next_direction_to_precisify = (SubLObject)((old_next_direction_to_precisify == cb_precision_suggestor.$kw156$GENERALIZE) ? cb_precision_suggestor.$kw157$SPECIALIZE : cb_precision_suggestor.$kw156$GENERALIZE);
        final SubLObject new_next_arg_to_precisify = (SubLObject)((new_next_direction_to_precisify == cb_precision_suggestor.$kw156$GENERALIZE) ? (old_next_arg_to_precisify.numGE(v_arity) ? cb_precision_suggestor.NIL : number_utilities.f_1X(old_next_arg_to_precisify)) : old_next_arg_to_precisify);
        return make_cb_precision_suggestor_rkf_state((SubLObject)ConsesLow.list((SubLObject)cb_precision_suggestor.$kw152$NEXT_ARG_TO_PRECISIFY, new_next_arg_to_precisify, (SubLObject)cb_precision_suggestor.$kw153$NEXT_DIRECTION_TO_PRECISIFY, new_next_direction_to_precisify));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 27673L)
    public static SubLObject copy_cb_precision_suggestor_rkf_state(final SubLObject cb_precision_suggestor_rkf_state) {
        final SubLObject next_arg_to_precisify = cb_ps_rkf_s_next_arg_to_precisify(cb_precision_suggestor_rkf_state);
        final SubLObject next_direction_to_precisify = cb_ps_rkf_s_next_direction_to_precisify(cb_precision_suggestor_rkf_state);
        return make_cb_precision_suggestor_rkf_state((SubLObject)ConsesLow.list((SubLObject)cb_precision_suggestor.$kw152$NEXT_ARG_TO_PRECISIFY, next_arg_to_precisify, (SubLObject)cb_precision_suggestor.$kw153$NEXT_DIRECTION_TO_PRECISIFY, next_direction_to_precisify));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 28146L)
    public static SubLObject cb_uia_precisify_argument_candidates_subsumption_preds(final SubLObject generalizeP, final SubLObject preds) {
        SubLObject ans = (SubLObject)cb_precision_suggestor.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)cb_precision_suggestor.NIL;
        pred = cdolist_list_var.first();
        while (cb_precision_suggestor.NIL != cdolist_list_var) {
            final SubLObject var = cb_uia_precisify_argument_candidates_subsumption_pred_for_pred(generalizeP, pred);
            if (cb_precision_suggestor.NIL != var) {
                ans = (SubLObject)ConsesLow.cons(var, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 28405L)
    public static SubLObject cb_uia_precisify_argument_candidates_subsumption_pred_for_pred(final SubLObject generalizeP, final SubLObject pred) {
        if (pred.eql(cb_precision_suggestor.$const158$genls)) {
            return (SubLObject)((cb_precision_suggestor.NIL != generalizeP) ? cb_precision_suggestor.$sym159$GENL_ : cb_precision_suggestor.$sym160$SPEC_);
        }
        if (pred.eql(cb_precision_suggestor.$const161$genlPreds)) {
            return (SubLObject)((cb_precision_suggestor.NIL != generalizeP) ? cb_precision_suggestor.$sym162$GENL_PREDICATE_ : cb_precision_suggestor.$sym163$SPEC_PREDICATE_);
        }
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 28805L)
    public static SubLObject cb_precisify_argument_candidates(final SubLObject formula, final SubLObject mt, final SubLObject argnum, final SubLObject direction, SubLObject type_col) {
        if (type_col == cb_precision_suggestor.UNPROVIDED) {
            type_col = (SubLObject)cb_precision_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_precision_suggestor.NIL == el_utilities.possibly_atomic_sentence_p(formula) || cb_precision_suggestor.NIL == fort_types_interface.predicateP(cycl_utilities.sentence_arg(formula, (SubLObject)cb_precision_suggestor.ZERO_INTEGER, (SubLObject)cb_precision_suggestor.UNPROVIDED))) {
            return (SubLObject)cb_precision_suggestor.NIL;
        }
        SubLObject result_sentences = (SubLObject)cb_precision_suggestor.NIL;
        final SubLObject generalizeP = Equality.eq(direction, (SubLObject)cb_precision_suggestor.$kw156$GENERALIZE);
        final SubLObject preds = rkf_precision_suggestor.rkf_sentence_arg_precisification_options(formula, mt, argnum, generalizeP);
        final SubLObject original_arg = cycl_utilities.sentence_arg(formula, argnum, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        if (cb_precision_suggestor.NIL == preds) {
            return (SubLObject)cb_precision_suggestor.NIL;
        }
        SubLObject suggestions = rkf_precision_suggestor.rkf_raw_precisify_arg(formula, argnum, mt, generalizeP, original_arg, preds, type_col);
        final SubLObject mode = (SubLObject)((cb_precision_suggestor.NIL != generalizeP) ? cb_precision_suggestor.$kw164$ASCENDING : cb_precision_suggestor.$kw165$DESCENDING);
        final SubLObject subsumption_preds = cb_uia_precisify_argument_candidates_subsumption_preds(generalizeP, preds);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = subsumption_preds;
            SubLObject subsumption_pred = (SubLObject)cb_precision_suggestor.NIL;
            subsumption_pred = cdolist_list_var.first();
            while (cb_precision_suggestor.NIL != cdolist_list_var) {
                suggestions = list_utilities.delete_subsumed_items(suggestions, subsumption_pred, (SubLObject)cb_precision_suggestor.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                subsumption_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = cardinality_estimates.sort_by_generality_estimate(suggestions, mode);
        SubLObject suggestion = (SubLObject)cb_precision_suggestor.NIL;
        suggestion = cdolist_list_var2.first();
        while (cb_precision_suggestor.NIL != cdolist_list_var2) {
            result_sentences = (SubLObject)ConsesLow.cons(el_utilities.replace_formula_arg(argnum, suggestion, formula), result_sentences);
            cdolist_list_var2 = cdolist_list_var2.rest();
            suggestion = cdolist_list_var2.first();
        }
        result_sentences = Sequences.delete_if(Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym166$CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION), result_sentences, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED, (SubLObject)cb_precision_suggestor.UNPROVIDED);
        return result_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 30412L)
    public static SubLObject cb_precision_suggestor_redundant_suggestion(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_precision_suggestor.NIL != kb_utilities.kbeq(cb_precision_suggestor.$const158$genls, cycl_utilities.formula_arg0(sentence)) && cycl_utilities.formula_arg1(sentence, (SubLObject)cb_precision_suggestor.UNPROVIDED).equal(cycl_utilities.formula_arg2(sentence, (SubLObject)cb_precision_suggestor.UNPROVIDED)));
    }
    
    public static SubLObject declare_cb_precision_suggestor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_link_precision_suggest", "CB-LINK-PRECISION-SUGGEST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggest", "CB-PRECISION-SUGGEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggest_assertion", "CB-PRECISION-SUGGEST-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggest_next", "CB-PRECISION-SUGGEST-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggest_done", "CB-PRECISION-SUGGEST-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_show_precision_suggestions", "CB-SHOW-PRECISION-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_handle_precision_suggest", "CB-HANDLE-PRECISION-SUGGEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_stale_page_submitted", "CB-PRECISION-SUGGESTOR-STALE-PAGE-SUBMITTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_state_stack_p", "CB-PRECISION-SUGGESTOR-STATE-STACK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_pending_stacks", "CB-PRECISION-SUGGESTOR-PENDING-STACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_link_precision_suggestor", "CB-LINK-PRECISION-SUGGESTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_restart_precision_suggestor", "CB-RESTART-PRECISION-SUGGESTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_restart_precision_suggestor_internal", "CB-RESTART-PRECISION-SUGGESTOR-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_restart_precision_suggestor_guts", "CB-RESTART-PRECISION-SUGGESTOR-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_link_resume_precision_suggest", "CB-LINK-RESUME-PRECISION-SUGGEST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_resume_precision_suggest", "CB-RESUME-PRECISION-SUGGEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_link_destroy_precision_suggest", "CB-LINK-DESTROY-PRECISION-SUGGEST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_destroy_precision_suggest", "CB-DESTROY-PRECISION-SUGGEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_link_destroy_all_precision_suggest", "CB-LINK-DESTROY-ALL-PRECISION-SUGGEST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_destroy_all_precision_suggest", "CB-DESTROY-ALL-PRECISION-SUGGEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_show_original_assertion", "CB-PRECISION-SUGGESTOR-SHOW-ORIGINAL-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_show_current_formula", "CB-PRECISION-SUGGESTOR-SHOW-CURRENT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_show_formula", "CB-PRECISION-SUGGESTOR-SHOW-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_state_print_function_trampoline", "CB-PRECISION-SUGGESTOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_state_p", "CB-PRECISION-SUGGESTOR-STATE-P", 1, 0, false);
        new $cb_precision_suggestor_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_original_formula", "CB-PSS-ORIGINAL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_original_mt", "CB-PSS-ORIGINAL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_current_formula", "CB-PSS-CURRENT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_current_mt", "CB-PSS-CURRENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_suggestions", "CB-PSS-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_precision_suggestion_function", "CB-PSS-PRECISION-SUGGESTION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_implementation_specific_state_update_function", "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_pss_implementation_specific_state", "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_original_formula", "_CSETF-CB-PSS-ORIGINAL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_original_mt", "_CSETF-CB-PSS-ORIGINAL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_current_formula", "_CSETF-CB-PSS-CURRENT-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_current_mt", "_CSETF-CB-PSS-CURRENT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_suggestions", "_CSETF-CB-PSS-SUGGESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_precision_suggestion_function", "_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_implementation_specific_state_update_function", "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_pss_implementation_specific_state", "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "make_cb_precision_suggestor_state", "MAKE-CB-PRECISION-SUGGESTOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "visit_defstruct_cb_precision_suggestor_state", "VISIT-DEFSTRUCT-CB-PRECISION-SUGGESTOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "visit_defstruct_object_cb_precision_suggestor_state_method", "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "print_cb_precision_suggestor_state", "PRINT-CB-PRECISION-SUGGESTOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_state_possibly_initialP", "CB-PRECISION-SUGGESTOR-STATE-POSSIBLY-INITIAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_generate_precision_suggestions", "CB-GENERATE-PRECISION-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "new_cb_precision_suggestor_initial_state", "NEW-CB-PRECISION-SUGGESTOR-INITIAL-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "new_cb_precision_suggestor_state_for_selected_suggestion", "NEW-CB-PRECISION-SUGGESTOR-STATE-FOR-SELECTED-SUGGESTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "new_cb_precision_suggestor_state_if_suggestions_rejected", "NEW-CB-PRECISION-SUGGESTOR-STATE-IF-SUGGESTIONS-REJECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_current_precision_suggestion_implementation_properties", "CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestion_implementations", "CB-PRECISION-SUGGESTION-IMPLEMENTATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestion_implementation_p", "CB-PRECISION-SUGGESTION-IMPLEMENTATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestion_implementation_properties", "CB-PRECISION-SUGGESTION-IMPLEMENTATION-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "declare_cb_precision_suggestion_implementation", "DECLARE-CB-PRECISION-SUGGESTION-IMPLEMENTATION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "undeclare_cb_precision_suggestion_implementation", "UNDECLARE-CB-PRECISION-SUGGESTION-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_inference_precision_suggestion_function", "CB-INFERENCE-PRECISION-SUGGESTION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "inference_precision_suggest", "INFERENCE-PRECISION-SUGGEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_initial_inference_state", "CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_inference_state_update_function", "CB-PRECISION-SUGGESTOR-INFERENCE-STATE-UPDATE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_rkf_precision_suggestion_function", "CB-RKF-PRECISION-SUGGESTION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_rkf_state_print_function_trampoline", "CB-PRECISION-SUGGESTOR-RKF-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_rkf_state_p", "CB-PRECISION-SUGGESTOR-RKF-STATE-P", 1, 0, false);
        new $cb_precision_suggestor_rkf_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_ps_rkf_s_next_arg_to_precisify", "CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_ps_rkf_s_next_direction_to_precisify", "CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_ps_rkf_s_next_arg_to_precisify", "_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "_csetf_cb_ps_rkf_s_next_direction_to_precisify", "_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "make_cb_precision_suggestor_rkf_state", "MAKE-CB-PRECISION-SUGGESTOR-RKF-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "visit_defstruct_cb_precision_suggestor_rkf_state", "VISIT-DEFSTRUCT-CB-PRECISION-SUGGESTOR-RKF-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "visit_defstruct_object_cb_precision_suggestor_rkf_state_method", "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-RKF-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_initial_rkf_state", "CB-PRECISION-SUGGESTOR-INITIAL-RKF-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_rkf_state_update_function", "CB-PRECISION-SUGGESTOR-RKF-STATE-UPDATE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "copy_cb_precision_suggestor_rkf_state", "COPY-CB-PRECISION-SUGGESTOR-RKF-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_uia_precisify_argument_candidates_subsumption_preds", "CB-UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_uia_precisify_argument_candidates_subsumption_pred_for_pred", "CB-UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PRED-FOR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precisify_argument_candidates", "CB-PRECISIFY-ARGUMENT-CANDIDATES", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_precision_suggestor", "cb_precision_suggestor_redundant_suggestion", "CB-PRECISION-SUGGESTOR-REDUNDANT-SUGGESTION", 1, 0, false);
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    public static SubLObject init_cb_precision_suggestor_file() {
        cb_precision_suggestor.$dtp_cb_precision_suggestor_state$ = SubLFiles.defconstant("*DTP-CB-PRECISION-SUGGESTOR-STATE*", (SubLObject)cb_precision_suggestor.$sym81$CB_PRECISION_SUGGESTOR_STATE);
        cb_precision_suggestor.$cb_current_precision_suggestion_implementation$ = SubLFiles.deflexical("*CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION*", (SubLObject)(maybeDefault((SubLObject)cb_precision_suggestor.$sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_, cb_precision_suggestor.$cb_current_precision_suggestion_implementation$, cb_precision_suggestor.$kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION)));
        cb_precision_suggestor.$cb_precision_suggestion_implementations$ = SubLFiles.deflexical("*CB-PRECISION-SUGGESTION-IMPLEMENTATIONS*", (SubLObject)(maybeDefault((SubLObject)cb_precision_suggestor.$sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_, cb_precision_suggestor.$cb_precision_suggestion_implementations$, cb_precision_suggestor.NIL)));
        cb_precision_suggestor.$dtp_cb_precision_suggestor_rkf_state$ = SubLFiles.defconstant("*DTP-CB-PRECISION-SUGGESTOR-RKF-STATE*", (SubLObject)cb_precision_suggestor.$sym139$CB_PRECISION_SUGGESTOR_RKF_STATE);
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    public static SubLObject setup_cb_precision_suggestor_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_precision_suggestor.$kw3$PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$sym4$CB_LINK_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_precision_suggestor.$sym8$CB_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$kw9$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_precision_suggestor.$sym35$CB_HANDLE_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$kw9$HTML_HANDLER);
        cb_utilities.declare_cb_tool((SubLObject)cb_precision_suggestor.$kw39$PRECISION_SUGGESTOR, (SubLObject)cb_precision_suggestor.$str12$Precision_Suggestor, (SubLObject)cb_precision_suggestor.$str40$Precis, (SubLObject)cb_precision_suggestor.$str41$Restart_the_Precision_Suggestor_t);
        cb_utilities.setup_cb_link_method((SubLObject)cb_precision_suggestor.$kw39$PRECISION_SUGGESTOR, (SubLObject)cb_precision_suggestor.$sym45$CB_LINK_PRECISION_SUGGESTOR, (SubLObject)cb_precision_suggestor.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_precision_suggestor.$sym47$CB_RESTART_PRECISION_SUGGESTOR, (SubLObject)cb_precision_suggestor.$kw9$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_precision_suggestor.$kw59$RESUME_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$sym66$CB_LINK_RESUME_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_precision_suggestor.$sym68$CB_RESUME_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$kw9$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_precision_suggestor.$kw60$DESTROY_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$sym71$CB_LINK_DESTROY_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_precision_suggestor.$sym73$CB_DESTROY_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$kw9$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_precision_suggestor.$kw55$DESTROY_ALL_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$sym76$CB_LINK_DESTROY_ALL_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_precision_suggestor.$sym77$CB_DESTROY_ALL_PRECISION_SUGGEST, (SubLObject)cb_precision_suggestor.$kw9$HTML_HANDLER);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_precision_suggestor.$dtp_cb_precision_suggestor_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym87$CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_precision_suggestor.$list88);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym89$CB_PSS_ORIGINAL_FORMULA, (SubLObject)cb_precision_suggestor.$sym90$_CSETF_CB_PSS_ORIGINAL_FORMULA);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym91$CB_PSS_ORIGINAL_MT, (SubLObject)cb_precision_suggestor.$sym92$_CSETF_CB_PSS_ORIGINAL_MT);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym93$CB_PSS_CURRENT_FORMULA, (SubLObject)cb_precision_suggestor.$sym94$_CSETF_CB_PSS_CURRENT_FORMULA);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym95$CB_PSS_CURRENT_MT, (SubLObject)cb_precision_suggestor.$sym96$_CSETF_CB_PSS_CURRENT_MT);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym97$CB_PSS_SUGGESTIONS, (SubLObject)cb_precision_suggestor.$sym98$_CSETF_CB_PSS_SUGGESTIONS);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym99$CB_PSS_PRECISION_SUGGESTION_FUNCTION, (SubLObject)cb_precision_suggestor.$sym100$_CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym101$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, (SubLObject)cb_precision_suggestor.$sym102$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym103$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE, (SubLObject)cb_precision_suggestor.$sym104$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE);
        Equality.identity((SubLObject)cb_precision_suggestor.$sym81$CB_PRECISION_SUGGESTOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_precision_suggestor.$dtp_cb_precision_suggestor_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym118$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)cb_precision_suggestor.$sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_precision_suggestor.$sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_);
        declare_cb_precision_suggestion_implementation((SubLObject)cb_precision_suggestor.$kw125$CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION, (SubLObject)cb_precision_suggestor.$str126$OE_inference_based_implementation, (SubLObject)cb_precision_suggestor.$sym127$CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION, (SubLObject)cb_precision_suggestor.$sym128$CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE, (SubLObject)cb_precision_suggestor.$sym129$CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION);
        declare_cb_precision_suggestion_implementation((SubLObject)cb_precision_suggestor.$kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION, (SubLObject)cb_precision_suggestor.$str135$RKF_implementation, (SubLObject)cb_precision_suggestor.$sym136$CB_RKF_PRECISION_SUGGESTION_FUNCTION, (SubLObject)cb_precision_suggestor.$sym137$CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE, (SubLObject)cb_precision_suggestor.$sym138$CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_precision_suggestor.$dtp_cb_precision_suggestor_rkf_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym146$CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_precision_suggestor.$list147);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym148$CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY, (SubLObject)cb_precision_suggestor.$sym149$_CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY);
        Structures.def_csetf((SubLObject)cb_precision_suggestor.$sym150$CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY, (SubLObject)cb_precision_suggestor.$sym151$_CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY);
        Equality.identity((SubLObject)cb_precision_suggestor.$sym139$CB_PRECISION_SUGGESTOR_RKF_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_precision_suggestor.$dtp_cb_precision_suggestor_rkf_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_precision_suggestor.$sym155$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD));
        return (SubLObject)cb_precision_suggestor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_precision_suggestor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_precision_suggestor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_precision_suggestor_file();
    }
    
    static {
        me = (SubLFile)new cb_precision_suggestor();
        cb_precision_suggestor.$dtp_cb_precision_suggestor_state$ = null;
        cb_precision_suggestor.$cb_current_precision_suggestion_implementation$ = null;
        cb_precision_suggestor.$cb_precision_suggestion_implementations$ = null;
        cb_precision_suggestor.$dtp_cb_precision_suggestor_rkf_state$ = null;
        $str0$_Precisify_ = SubLObjectFactory.makeString("[Precisify]");
        $kw1$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str2$cb_precision_suggest__a = SubLObjectFactory.makeString("cb-precision-suggest&~a");
        $kw3$PRECISION_SUGGEST = SubLObjectFactory.makeKeyword("PRECISION-SUGGEST");
        $sym4$CB_LINK_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-LINK-PRECISION-SUGGEST");
        $str5$the_Cyc_KB_editing_facilities = SubLObjectFactory.makeString("the Cyc KB editing facilities");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $str7$_a_does_not_specify_an_assertion = SubLObjectFactory.makeString("~a does not specify an assertion");
        $sym8$CB_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGEST");
        $kw9$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str10$Precision_suggestor_done = SubLObjectFactory.makeString("Precision suggestor done");
        $kw11$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str12$Precision_Suggestor = SubLObjectFactory.makeString("Precision Suggestor");
        $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str14$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw15$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw16$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw17$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw18$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str19$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str20$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str21$button = SubLObjectFactory.makeString("button");
        $str22$reload = SubLObjectFactory.makeString("reload");
        $str23$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str24$post = SubLObjectFactory.makeString("post");
        $str25$cb_handle_precision_suggest = SubLObjectFactory.makeString("cb-handle-precision-suggest");
        $str26$stack_id = SubLObjectFactory.makeString("stack-id");
        $str27$state_id = SubLObjectFactory.makeString("state-id");
        $str28$The_following_are_more_precise_ve = SubLObjectFactory.makeString("The following are more precise versions of ");
        $str29$_in_ = SubLObjectFactory.makeString(" in ");
        $str30$_ = SubLObjectFactory.makeString(".");
        $str31$Select_all_that_are_true__possibl = SubLObjectFactory.makeString("Select all that are true (possibly none) and click Submit.");
        $str32$_Warning___If_there_are_meta_asse = SubLObjectFactory.makeString("(Warning:  If there are meta-assertions on the original assertion, they will not be preserved on the precisified version.)");
        $str33$Submit = SubLObjectFactory.makeString("Submit");
        $str34$t = SubLObjectFactory.makeString("t");
        $sym35$CB_HANDLE_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-HANDLE-PRECISION-SUGGEST");
        $str36$You_submitted_a_stale_Precision_S = SubLObjectFactory.makeString("You submitted a stale Precision Suggestor page.  No action taken.");
        $sym37$CB_PRECISION_SUGGESTOR_STATE_P = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-STATE-P");
        $sym38$CB_PRECISION_SUGGESTOR_STATE_STACK_P = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-STATE-STACK-P");
        $kw39$PRECISION_SUGGESTOR = SubLObjectFactory.makeKeyword("PRECISION-SUGGESTOR");
        $str40$Precis = SubLObjectFactory.makeString("Precis");
        $str41$Restart_the_Precision_Suggestor_t = SubLObjectFactory.makeString("Restart the Precision Suggestor tool where you left off");
        $str42$_Precis_ = SubLObjectFactory.makeString("[Precis]");
        $kw43$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str44$cb_restart_precision_suggestor = SubLObjectFactory.makeString("cb-restart-precision-suggestor");
        $sym45$CB_LINK_PRECISION_SUGGESTOR = SubLObjectFactory.makeSymbol("CB-LINK-PRECISION-SUGGESTOR");
        $str46$the_Precision_Suggestor = SubLObjectFactory.makeString("the Precision Suggestor");
        $sym47$CB_RESTART_PRECISION_SUGGESTOR = SubLObjectFactory.makeSymbol("CB-RESTART-PRECISION-SUGGESTOR");
        $str48$There_are_no_unfinished_Precision = SubLObjectFactory.makeString("There are no unfinished Precision Suggestor sessions.  To start one, browse an assertion and click [Precisify].");
        $sym49$NON_EMPTY_LIST_P = SubLObjectFactory.makeSymbol("NON-EMPTY-LIST-P");
        $sym50$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $str51$cb_handle_precision_suggestor_res = SubLObjectFactory.makeString("cb-handle-precision-suggestor-restart");
        $str52$Unfinished_sessions = SubLObjectFactory.makeString("Unfinished sessions");
        $str53$Resume_or_destroy_unfinished_Prec = SubLObjectFactory.makeString("Resume or destroy unfinished Precision Suggestor sessions that you have started.");
        $str54$__A_total_ = SubLObjectFactory.makeString("(~A total)");
        $kw55$DESTROY_ALL_PRECISION_SUGGEST = SubLObjectFactory.makeKeyword("DESTROY-ALL-PRECISION-SUGGEST");
        $kw56$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw57$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str58$Actions = SubLObjectFactory.makeString("Actions");
        $kw59$RESUME_PRECISION_SUGGEST = SubLObjectFactory.makeKeyword("RESUME-PRECISION-SUGGEST");
        $kw60$DESTROY_PRECISION_SUGGEST = SubLObjectFactory.makeKeyword("DESTROY-PRECISION-SUGGEST");
        $str61$Original_assertion = SubLObjectFactory.makeString("Original assertion");
        $str62$Current_formula = SubLObjectFactory.makeString("Current formula");
        $str63$Leaves = SubLObjectFactory.makeString("Leaves");
        $str64$_Resume_ = SubLObjectFactory.makeString("[Resume]");
        $str65$cb_resume_precision_suggest__a = SubLObjectFactory.makeString("cb-resume-precision-suggest&~a");
        $sym66$CB_LINK_RESUME_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-LINK-RESUME-PRECISION-SUGGEST");
        $str67$You_attempted_to_resume_a_Precisi = SubLObjectFactory.makeString("You attempted to resume a Precision Suggestor session that no longer exists.");
        $sym68$CB_RESUME_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-RESUME-PRECISION-SUGGEST");
        $str69$_Destroy_ = SubLObjectFactory.makeString("[Destroy]");
        $str70$cb_destroy_precision_suggest__a = SubLObjectFactory.makeString("cb-destroy-precision-suggest&~a");
        $sym71$CB_LINK_DESTROY_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-LINK-DESTROY-PRECISION-SUGGEST");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-AS-STRING"));
        $sym73$CB_DESTROY_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-DESTROY-PRECISION-SUGGEST");
        $str74$_Destroy_All_ = SubLObjectFactory.makeString("[Destroy All]");
        $str75$cb_destroy_all_precision_suggest_ = SubLObjectFactory.makeString("cb-destroy-all-precision-suggest&~a");
        $sym76$CB_LINK_DESTROY_ALL_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-LINK-DESTROY-ALL-PRECISION-SUGGEST");
        $sym77$CB_DESTROY_ALL_PRECISION_SUGGEST = SubLObjectFactory.makeSymbol("CB-DESTROY-ALL-PRECISION-SUGGEST");
        $str78$None_ = SubLObjectFactory.makeString("None.");
        $str79$Mt__ = SubLObjectFactory.makeString("Mt :");
        $str80$Sentence__ = SubLObjectFactory.makeString("Sentence :");
        $sym81$CB_PRECISION_SUGGESTOR_STATE = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-STATE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SUGGESTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("PRECISION-SUGGESTION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("IMPLEMENTATION-SPECIFIC-STATE"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORIGINAL-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("ORIGINAL-MT"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("SUGGESTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("PRECISION-SUGGESTION-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("IMPLEMENTATION-SPECIFIC-STATE"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-ORIGINAL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-ORIGINAL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-CURRENT-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-CURRENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-SUGGESTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-PRECISION-SUGGESTION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-ORIGINAL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-ORIGINAL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-CURRENT-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-CURRENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-SUGGESTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE"));
        $sym86$PRINT_CB_PRECISION_SUGGESTOR_STATE = SubLObjectFactory.makeSymbol("PRINT-CB-PRECISION-SUGGESTOR-STATE");
        $sym87$CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-STATE-P"));
        $sym89$CB_PSS_ORIGINAL_FORMULA = SubLObjectFactory.makeSymbol("CB-PSS-ORIGINAL-FORMULA");
        $sym90$_CSETF_CB_PSS_ORIGINAL_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-ORIGINAL-FORMULA");
        $sym91$CB_PSS_ORIGINAL_MT = SubLObjectFactory.makeSymbol("CB-PSS-ORIGINAL-MT");
        $sym92$_CSETF_CB_PSS_ORIGINAL_MT = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-ORIGINAL-MT");
        $sym93$CB_PSS_CURRENT_FORMULA = SubLObjectFactory.makeSymbol("CB-PSS-CURRENT-FORMULA");
        $sym94$_CSETF_CB_PSS_CURRENT_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-CURRENT-FORMULA");
        $sym95$CB_PSS_CURRENT_MT = SubLObjectFactory.makeSymbol("CB-PSS-CURRENT-MT");
        $sym96$_CSETF_CB_PSS_CURRENT_MT = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-CURRENT-MT");
        $sym97$CB_PSS_SUGGESTIONS = SubLObjectFactory.makeSymbol("CB-PSS-SUGGESTIONS");
        $sym98$_CSETF_CB_PSS_SUGGESTIONS = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-SUGGESTIONS");
        $sym99$CB_PSS_PRECISION_SUGGESTION_FUNCTION = SubLObjectFactory.makeSymbol("CB-PSS-PRECISION-SUGGESTION-FUNCTION");
        $sym100$_CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION");
        $sym101$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = SubLObjectFactory.makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION");
        $sym102$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION");
        $sym103$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE = SubLObjectFactory.makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE");
        $sym104$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE = SubLObjectFactory.makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE");
        $kw105$ORIGINAL_FORMULA = SubLObjectFactory.makeKeyword("ORIGINAL-FORMULA");
        $kw106$ORIGINAL_MT = SubLObjectFactory.makeKeyword("ORIGINAL-MT");
        $kw107$CURRENT_FORMULA = SubLObjectFactory.makeKeyword("CURRENT-FORMULA");
        $kw108$CURRENT_MT = SubLObjectFactory.makeKeyword("CURRENT-MT");
        $kw109$SUGGESTIONS = SubLObjectFactory.makeKeyword("SUGGESTIONS");
        $kw110$PRECISION_SUGGESTION_FUNCTION = SubLObjectFactory.makeKeyword("PRECISION-SUGGESTION-FUNCTION");
        $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = SubLObjectFactory.makeKeyword("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION");
        $kw112$IMPLEMENTATION_SPECIFIC_STATE = SubLObjectFactory.makeKeyword("IMPLEMENTATION-SPECIFIC-STATE");
        $str113$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw114$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE = SubLObjectFactory.makeSymbol("MAKE-CB-PRECISION-SUGGESTOR-STATE");
        $kw116$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw117$END = SubLObjectFactory.makeKeyword("END");
        $sym118$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-STATE-METHOD");
        $str119$_S = SubLObjectFactory.makeString("~S");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PRECISION-SUGGESTION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-IMPLEMENTATION-SPECIFIC-STATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"));
        $sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_ = SubLObjectFactory.makeSymbol("*CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION*");
        $kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION = SubLObjectFactory.makeKeyword("CB-RKF-PRECISION-SUGGESTION-IMPLEMENTATION");
        $sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_ = SubLObjectFactory.makeSymbol("*CB-PRECISION-SUGGESTION-IMPLEMENTATIONS*");
        $sym124$CAR = SubLObjectFactory.makeSymbol("CAR");
        $kw125$CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION = SubLObjectFactory.makeKeyword("CB-INFERENCE-PRECISION-SUGGESTION-IMPLEMENTATION");
        $str126$OE_inference_based_implementation = SubLObjectFactory.makeString("OE/inference-based implementation");
        $sym127$CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION = SubLObjectFactory.makeSymbol("CB-INFERENCE-PRECISION-SUGGESTION-FUNCTION");
        $sym128$CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE");
        $sym129$CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-INFERENCE-STATE-UPDATE-FUNCTION");
        $str130$keStrengtheningSuggestion = SubLObjectFactory.makeString("keStrengtheningSuggestion");
        $sym131$_STRONG = SubLObjectFactory.makeSymbol("?STRONG");
        $const132$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const133$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)cb_precision_suggestor.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeInteger(60));
        $str135$RKF_implementation = SubLObjectFactory.makeString("RKF implementation");
        $sym136$CB_RKF_PRECISION_SUGGESTION_FUNCTION = SubLObjectFactory.makeSymbol("CB-RKF-PRECISION-SUGGESTION-FUNCTION");
        $sym137$CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-INITIAL-RKF-STATE");
        $sym138$CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-UPDATE-FUNCTION");
        $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE");
        $sym140$CB_PRECISION_SUGGESTOR_RKF_STATE_P = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-P");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ARG-TO-PRECISIFY"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-DIRECTION-TO-PRECISIFY"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEXT-ARG-TO-PRECISIFY"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT-DIRECTION-TO-PRECISIFY"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY"));
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY"));
        $sym145$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym146$CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-P"));
        $sym148$CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY = SubLObjectFactory.makeSymbol("CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY");
        $sym149$_CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY = SubLObjectFactory.makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY");
        $sym150$CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY = SubLObjectFactory.makeSymbol("CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY");
        $sym151$_CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY = SubLObjectFactory.makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY");
        $kw152$NEXT_ARG_TO_PRECISIFY = SubLObjectFactory.makeKeyword("NEXT-ARG-TO-PRECISIFY");
        $kw153$NEXT_DIRECTION_TO_PRECISIFY = SubLObjectFactory.makeKeyword("NEXT-DIRECTION-TO-PRECISIFY");
        $sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE = SubLObjectFactory.makeSymbol("MAKE-CB-PRECISION-SUGGESTOR-RKF-STATE");
        $sym155$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-RKF-STATE-METHOD");
        $kw156$GENERALIZE = SubLObjectFactory.makeKeyword("GENERALIZE");
        $kw157$SPECIALIZE = SubLObjectFactory.makeKeyword("SPECIALIZE");
        $const158$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym159$GENL_ = SubLObjectFactory.makeSymbol("GENL?");
        $sym160$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $const161$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym162$GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("GENL-PREDICATE?");
        $sym163$SPEC_PREDICATE_ = SubLObjectFactory.makeSymbol("SPEC-PREDICATE?");
        $kw164$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $kw165$DESCENDING = SubLObjectFactory.makeKeyword("DESCENDING");
        $sym166$CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION = SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-REDUNDANT-SUGGESTION");
    }
    
    public static final class $cb_precision_suggestor_state_native extends SubLStructNative
    {
        public SubLObject $original_formula;
        public SubLObject $original_mt;
        public SubLObject $current_formula;
        public SubLObject $current_mt;
        public SubLObject $suggestions;
        public SubLObject $precision_suggestion_function;
        public SubLObject $implementation_specific_state_update_function;
        public SubLObject $implementation_specific_state;
        private static final SubLStructDeclNative structDecl;
        
        public $cb_precision_suggestor_state_native() {
            this.$original_formula = (SubLObject)CommonSymbols.NIL;
            this.$original_mt = (SubLObject)CommonSymbols.NIL;
            this.$current_formula = (SubLObject)CommonSymbols.NIL;
            this.$current_mt = (SubLObject)CommonSymbols.NIL;
            this.$suggestions = (SubLObject)CommonSymbols.NIL;
            this.$precision_suggestion_function = (SubLObject)CommonSymbols.NIL;
            this.$implementation_specific_state_update_function = (SubLObject)CommonSymbols.NIL;
            this.$implementation_specific_state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cb_precision_suggestor_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$original_formula;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$original_mt;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$current_formula;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$current_mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$suggestions;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$precision_suggestion_function;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$implementation_specific_state_update_function;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$implementation_specific_state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$original_formula = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$original_mt = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$current_formula = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$current_mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$suggestions = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$precision_suggestion_function = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$implementation_specific_state_update_function = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$implementation_specific_state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cb_precision_suggestor_state_native.class, cb_precision_suggestor.$sym81$CB_PRECISION_SUGGESTOR_STATE, cb_precision_suggestor.$sym37$CB_PRECISION_SUGGESTOR_STATE_P, cb_precision_suggestor.$list82, cb_precision_suggestor.$list83, new String[] { "$original_formula", "$original_mt", "$current_formula", "$current_mt", "$suggestions", "$precision_suggestion_function", "$implementation_specific_state_update_function", "$implementation_specific_state" }, cb_precision_suggestor.$list84, cb_precision_suggestor.$list85, cb_precision_suggestor.$sym86$PRINT_CB_PRECISION_SUGGESTOR_STATE);
        }
    }
    
    public static final class $cb_precision_suggestor_state_p$UnaryFunction extends UnaryFunction
    {
        public $cb_precision_suggestor_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CB-PRECISION-SUGGESTOR-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_precision_suggestor.cb_precision_suggestor_state_p(arg1);
        }
    }
    
    public static final class $cb_precision_suggestor_rkf_state_native extends SubLStructNative
    {
        public SubLObject $next_arg_to_precisify;
        public SubLObject $next_direction_to_precisify;
        private static final SubLStructDeclNative structDecl;
        
        public $cb_precision_suggestor_rkf_state_native() {
            this.$next_arg_to_precisify = (SubLObject)CommonSymbols.NIL;
            this.$next_direction_to_precisify = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cb_precision_suggestor_rkf_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$next_arg_to_precisify;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$next_direction_to_precisify;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$next_arg_to_precisify = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$next_direction_to_precisify = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cb_precision_suggestor_rkf_state_native.class, cb_precision_suggestor.$sym139$CB_PRECISION_SUGGESTOR_RKF_STATE, cb_precision_suggestor.$sym140$CB_PRECISION_SUGGESTOR_RKF_STATE_P, cb_precision_suggestor.$list141, cb_precision_suggestor.$list142, new String[] { "$next_arg_to_precisify", "$next_direction_to_precisify" }, cb_precision_suggestor.$list143, cb_precision_suggestor.$list144, cb_precision_suggestor.$sym145$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $cb_precision_suggestor_rkf_state_p$UnaryFunction extends UnaryFunction
    {
        public $cb_precision_suggestor_rkf_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CB-PRECISION-SUGGESTOR-RKF-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_precision_suggestor.cb_precision_suggestor_rkf_state_p(arg1);
        }
    }
}

/*

	Total time: 790 ms
	
*/