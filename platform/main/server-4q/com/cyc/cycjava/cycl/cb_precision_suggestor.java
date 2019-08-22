package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class cb_precision_suggestor extends SubLTranslatedFile {
    public static final SubLFile me = new cb_precision_suggestor();

    public static final String myName = "com.cyc.cycjava.cycl.cb_precision_suggestor";

    public static final String myFingerPrint = "773b60199c8c1551ee8f991ade2297c66a7d5c38d5300f9ed0533ea4b8413812";

    // defconstant
    public static final SubLSymbol $dtp_cb_precision_suggestor_state$ = makeSymbol("*DTP-CB-PRECISION-SUGGESTOR-STATE*");





    // defconstant
    public static final SubLSymbol $dtp_cb_precision_suggestor_rkf_state$ = makeSymbol("*DTP-CB-PRECISION-SUGGESTOR-RKF-STATE*");

    // Internal Constants
    public static final SubLString $str0$_Precisify_ = makeString("[Precisify]");



    public static final SubLString $str2$cb_precision_suggest__a = makeString("cb-precision-suggest&~a");



    public static final SubLSymbol CB_LINK_PRECISION_SUGGEST = makeSymbol("CB-LINK-PRECISION-SUGGEST");

    public static final SubLString $$$the_Cyc_KB_editing_facilities = makeString("the Cyc KB editing facilities");

    public static final SubLList $list6 = list(makeSymbol("ID"));

    public static final SubLString $str7$_a_does_not_specify_an_assertion = makeString("~a does not specify an assertion");

    public static final SubLSymbol CB_PRECISION_SUGGEST = makeSymbol("CB-PRECISION-SUGGEST");



    private static final SubLString $$$Precision_suggestor_done = makeString("Precision suggestor done");



    private static final SubLString $$$Precision_Suggestor = makeString("Precision Suggestor");

    private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str19$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str25$cb_handle_precision_suggest = makeString("cb-handle-precision-suggest");

    private static final SubLString $str26$stack_id = makeString("stack-id");

    private static final SubLString $str27$state_id = makeString("state-id");

    private static final SubLString $str28$The_following_are_more_precise_ve = makeString("The following are more precise versions of ");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLString $str30$_ = makeString(".");

    private static final SubLString $str31$Select_all_that_are_true__possibl = makeString("Select all that are true (possibly none) and click Submit.");

    private static final SubLString $str32$_Warning___If_there_are_meta_asse = makeString("(Warning:  If there are meta-assertions on the original assertion, they will not be preserved on the precisified version.)");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $$$t = makeString("t");

    private static final SubLSymbol CB_HANDLE_PRECISION_SUGGEST = makeSymbol("CB-HANDLE-PRECISION-SUGGEST");

    private static final SubLString $str36$You_submitted_a_stale_Precision_S = makeString("You submitted a stale Precision Suggestor page.  No action taken.");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_STATE_P = makeSymbol("CB-PRECISION-SUGGESTOR-STATE-P");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_STATE_STACK_P = makeSymbol("CB-PRECISION-SUGGESTOR-STATE-STACK-P");



    private static final SubLString $$$Precis = makeString("Precis");

    private static final SubLString $str41$Restart_the_Precision_Suggestor_t = makeString("Restart the Precision Suggestor tool where you left off");

    private static final SubLString $str42$_Precis_ = makeString("[Precis]");



    private static final SubLString $str44$cb_restart_precision_suggestor = makeString("cb-restart-precision-suggestor");

    private static final SubLSymbol CB_LINK_PRECISION_SUGGESTOR = makeSymbol("CB-LINK-PRECISION-SUGGESTOR");

    private static final SubLString $$$the_Precision_Suggestor = makeString("the Precision Suggestor");

    private static final SubLSymbol CB_RESTART_PRECISION_SUGGESTOR = makeSymbol("CB-RESTART-PRECISION-SUGGESTOR");

    private static final SubLString $str48$There_are_no_unfinished_Precision = makeString("There are no unfinished Precision Suggestor sessions.  To start one, browse an assertion and click [Precisify].");

    private static final SubLSymbol NON_EMPTY_LIST_P = makeSymbol("NON-EMPTY-LIST-P");



    private static final SubLString $str51$cb_handle_precision_suggestor_res = makeString("cb-handle-precision-suggestor-restart");

    private static final SubLString $$$Unfinished_sessions = makeString("Unfinished sessions");

    private static final SubLString $str53$Resume_or_destroy_unfinished_Prec = makeString("Resume or destroy unfinished Precision Suggestor sessions that you have started.");

    private static final SubLString $str54$__A_total_ = makeString("(~A total)");

    private static final SubLSymbol $DESTROY_ALL_PRECISION_SUGGEST = makeKeyword("DESTROY-ALL-PRECISION-SUGGEST");





    private static final SubLString $$$Actions = makeString("Actions");

    private static final SubLSymbol $RESUME_PRECISION_SUGGEST = makeKeyword("RESUME-PRECISION-SUGGEST");

    private static final SubLSymbol $DESTROY_PRECISION_SUGGEST = makeKeyword("DESTROY-PRECISION-SUGGEST");

    private static final SubLString $$$Original_assertion = makeString("Original assertion");

    private static final SubLString $$$Current_formula = makeString("Current formula");

    private static final SubLString $$$Leaves = makeString("Leaves");

    private static final SubLString $str64$_Resume_ = makeString("[Resume]");

    private static final SubLString $str65$cb_resume_precision_suggest__a = makeString("cb-resume-precision-suggest&~a");

    private static final SubLSymbol CB_LINK_RESUME_PRECISION_SUGGEST = makeSymbol("CB-LINK-RESUME-PRECISION-SUGGEST");

    private static final SubLString $str67$You_attempted_to_resume_a_Precisi = makeString("You attempted to resume a Precision Suggestor session that no longer exists.");

    private static final SubLSymbol CB_RESUME_PRECISION_SUGGEST = makeSymbol("CB-RESUME-PRECISION-SUGGEST");

    private static final SubLString $str69$_Destroy_ = makeString("[Destroy]");

    private static final SubLString $str70$cb_destroy_precision_suggest__a = makeString("cb-destroy-precision-suggest&~a");

    private static final SubLSymbol CB_LINK_DESTROY_PRECISION_SUGGEST = makeSymbol("CB-LINK-DESTROY-PRECISION-SUGGEST");

    public static final SubLList $list72 = list(makeSymbol("ID-AS-STRING"));

    private static final SubLSymbol CB_DESTROY_PRECISION_SUGGEST = makeSymbol("CB-DESTROY-PRECISION-SUGGEST");

    private static final SubLString $str74$_Destroy_All_ = makeString("[Destroy All]");

    private static final SubLString $str75$cb_destroy_all_precision_suggest_ = makeString("cb-destroy-all-precision-suggest&~a");

    private static final SubLSymbol CB_LINK_DESTROY_ALL_PRECISION_SUGGEST = makeSymbol("CB-LINK-DESTROY-ALL-PRECISION-SUGGEST");

    private static final SubLSymbol CB_DESTROY_ALL_PRECISION_SUGGEST = makeSymbol("CB-DESTROY-ALL-PRECISION-SUGGEST");

    private static final SubLString $str78$None_ = makeString("None.");

    private static final SubLString $str79$Mt__ = makeString("Mt :");

    private static final SubLString $str80$Sentence__ = makeString("Sentence :");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_STATE = makeSymbol("CB-PRECISION-SUGGESTOR-STATE");

    private static final SubLList $list82 = list(makeSymbol("ORIGINAL-FORMULA"), makeSymbol("ORIGINAL-MT"), makeSymbol("CURRENT-FORMULA"), makeSymbol("CURRENT-MT"), makeSymbol("SUGGESTIONS"), makeSymbol("PRECISION-SUGGESTION-FUNCTION"), makeSymbol("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), makeSymbol("IMPLEMENTATION-SPECIFIC-STATE"));

    private static final SubLList $list83 = list(makeKeyword("ORIGINAL-FORMULA"), makeKeyword("ORIGINAL-MT"), makeKeyword("CURRENT-FORMULA"), makeKeyword("CURRENT-MT"), makeKeyword("SUGGESTIONS"), makeKeyword("PRECISION-SUGGESTION-FUNCTION"), makeKeyword("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), makeKeyword("IMPLEMENTATION-SPECIFIC-STATE"));

    private static final SubLList $list84 = list(makeSymbol("CB-PSS-ORIGINAL-FORMULA"), makeSymbol("CB-PSS-ORIGINAL-MT"), makeSymbol("CB-PSS-CURRENT-FORMULA"), makeSymbol("CB-PSS-CURRENT-MT"), makeSymbol("CB-PSS-SUGGESTIONS"), makeSymbol("CB-PSS-PRECISION-SUGGESTION-FUNCTION"), makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE"));

    private static final SubLList $list85 = list(makeSymbol("_CSETF-CB-PSS-ORIGINAL-FORMULA"), makeSymbol("_CSETF-CB-PSS-ORIGINAL-MT"), makeSymbol("_CSETF-CB-PSS-CURRENT-FORMULA"), makeSymbol("_CSETF-CB-PSS-CURRENT-MT"), makeSymbol("_CSETF-CB-PSS-SUGGESTIONS"), makeSymbol("_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION"), makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"), makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE"));

    private static final SubLSymbol PRINT_CB_PRECISION_SUGGESTOR_STATE = makeSymbol("PRINT-CB-PRECISION-SUGGESTOR-STATE");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CB-PRECISION-SUGGESTOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list88 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CB-PRECISION-SUGGESTOR-STATE-P"));

    private static final SubLSymbol CB_PSS_ORIGINAL_FORMULA = makeSymbol("CB-PSS-ORIGINAL-FORMULA");

    private static final SubLSymbol _CSETF_CB_PSS_ORIGINAL_FORMULA = makeSymbol("_CSETF-CB-PSS-ORIGINAL-FORMULA");

    private static final SubLSymbol CB_PSS_ORIGINAL_MT = makeSymbol("CB-PSS-ORIGINAL-MT");

    private static final SubLSymbol _CSETF_CB_PSS_ORIGINAL_MT = makeSymbol("_CSETF-CB-PSS-ORIGINAL-MT");

    private static final SubLSymbol CB_PSS_CURRENT_FORMULA = makeSymbol("CB-PSS-CURRENT-FORMULA");

    private static final SubLSymbol _CSETF_CB_PSS_CURRENT_FORMULA = makeSymbol("_CSETF-CB-PSS-CURRENT-FORMULA");

    private static final SubLSymbol CB_PSS_CURRENT_MT = makeSymbol("CB-PSS-CURRENT-MT");

    private static final SubLSymbol _CSETF_CB_PSS_CURRENT_MT = makeSymbol("_CSETF-CB-PSS-CURRENT-MT");

    private static final SubLSymbol CB_PSS_SUGGESTIONS = makeSymbol("CB-PSS-SUGGESTIONS");

    private static final SubLSymbol _CSETF_CB_PSS_SUGGESTIONS = makeSymbol("_CSETF-CB-PSS-SUGGESTIONS");

    private static final SubLSymbol CB_PSS_PRECISION_SUGGESTION_FUNCTION = makeSymbol("CB-PSS-PRECISION-SUGGESTION-FUNCTION");

    private static final SubLSymbol _CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION = makeSymbol("_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION");

    private static final SubLSymbol CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION");

    private static final SubLSymbol _CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION");

    private static final SubLSymbol CB_PSS_IMPLEMENTATION_SPECIFIC_STATE = makeSymbol("CB-PSS-IMPLEMENTATION-SPECIFIC-STATE");

    private static final SubLSymbol _CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE = makeSymbol("_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE");











    private static final SubLSymbol $PRECISION_SUGGESTION_FUNCTION = makeKeyword("PRECISION-SUGGESTION-FUNCTION");

    private static final SubLSymbol $IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = makeKeyword("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION");

    private static final SubLSymbol $IMPLEMENTATION_SPECIFIC_STATE = makeKeyword("IMPLEMENTATION-SPECIFIC-STATE");

    private static final SubLString $str113$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CB_PRECISION_SUGGESTOR_STATE = makeSymbol("MAKE-CB-PRECISION-SUGGESTOR-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-STATE-METHOD");

    private static final SubLString $str119$_S = makeString("~S");

    private static final SubLList $list120 = list(makeSymbol("NAME"), makeSymbol("PRECISION-SUGGESTION-FUNCTION"), makeSymbol("INITIAL-IMPLEMENTATION-SPECIFIC-STATE-FUNCTION"), makeSymbol("IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION"));

    private static final SubLSymbol $cb_current_precision_suggestion_implementation$ = makeSymbol("*CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION*");

    private static final SubLSymbol $CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION = makeKeyword("CB-RKF-PRECISION-SUGGESTION-IMPLEMENTATION");

    private static final SubLSymbol $cb_precision_suggestion_implementations$ = makeSymbol("*CB-PRECISION-SUGGESTION-IMPLEMENTATIONS*");



    private static final SubLSymbol $CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION = makeKeyword("CB-INFERENCE-PRECISION-SUGGESTION-IMPLEMENTATION");

    private static final SubLString $str126$OE_inference_based_implementation = makeString("OE/inference-based implementation");

    private static final SubLSymbol CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION = makeSymbol("CB-INFERENCE-PRECISION-SUGGESTION-FUNCTION");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE = makeSymbol("CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION = makeSymbol("CB-PRECISION-SUGGESTOR-INFERENCE-STATE-UPDATE-FUNCTION");

    private static final SubLString $$$keStrengtheningSuggestion = makeString("keStrengtheningSuggestion");

    private static final SubLSymbol $sym131$_STRONG = makeSymbol("?STRONG");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLList $list134 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-TIME"), makeInteger(60));

    private static final SubLString $$$RKF_implementation = makeString("RKF implementation");

    private static final SubLSymbol CB_RKF_PRECISION_SUGGESTION_FUNCTION = makeSymbol("CB-RKF-PRECISION-SUGGESTION-FUNCTION");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE = makeSymbol("CB-PRECISION-SUGGESTOR-INITIAL-RKF-STATE");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION = makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-UPDATE-FUNCTION");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_RKF_STATE = makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE");

    private static final SubLSymbol CB_PRECISION_SUGGESTOR_RKF_STATE_P = makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-P");

    private static final SubLList $list141 = list(makeSymbol("NEXT-ARG-TO-PRECISIFY"), makeSymbol("NEXT-DIRECTION-TO-PRECISIFY"));

    private static final SubLList $list142 = list(makeKeyword("NEXT-ARG-TO-PRECISIFY"), makeKeyword("NEXT-DIRECTION-TO-PRECISIFY"));

    private static final SubLList $list143 = list(makeSymbol("CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY"), makeSymbol("CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY"));

    private static final SubLList $list144 = list(makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY"), makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY"));



    private static final SubLSymbol CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list147 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CB-PRECISION-SUGGESTOR-RKF-STATE-P"));

    private static final SubLSymbol CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY = makeSymbol("CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY");

    private static final SubLSymbol _CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY = makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY");

    private static final SubLSymbol CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY = makeSymbol("CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY");

    private static final SubLSymbol _CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY = makeSymbol("_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY");

    private static final SubLSymbol $NEXT_ARG_TO_PRECISIFY = makeKeyword("NEXT-ARG-TO-PRECISIFY");

    private static final SubLSymbol $NEXT_DIRECTION_TO_PRECISIFY = makeKeyword("NEXT-DIRECTION-TO-PRECISIFY");

    private static final SubLSymbol MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE = makeSymbol("MAKE-CB-PRECISION-SUGGESTOR-RKF-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-RKF-STATE-METHOD");





    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $sym159$GENL_ = makeSymbol("GENL?");

    private static final SubLSymbol $sym160$SPEC_ = makeSymbol("SPEC?");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLSymbol $sym162$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

    private static final SubLSymbol $sym163$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");





    private static final SubLSymbol CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION = makeSymbol("CB-PRECISION-SUGGESTOR-REDUNDANT-SUGGESTION");

    public static SubLObject cb_link_precision_suggest(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_Precisify_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str2$cb_precision_suggest__a, assertion_handles.assertion_id(assertion));
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
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }

    public static SubLObject cb_precision_suggest(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id = NIL;
            destructuring_bind_must_consp(args, args, $list6);
            id = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject assertion = cb_guess_assertion(id);
                if (NIL == assertion_handles.assertion_p(assertion)) {
                    cb_error($str7$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_precision_suggest_assertion(assertion);
            } else {
                cdestructuring_bind_error(args, $list6);
            }
        }
        return NIL;
    }

    public static SubLObject cb_precision_suggest_assertion(final SubLObject assertion) {
        final SubLObject formula = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject state = new_cb_precision_suggestor_initial_state(formula, mt);
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(state, stack);
        return cb_precision_suggest_next(stack);
    }

    public static SubLObject cb_precision_suggest_next(final SubLObject cb_precision_suggestor_state_stack) {
        if (NIL != stacks.stack_empty_p(cb_precision_suggestor_state_stack)) {
            cb_glob_remove(cb_precision_suggestor_state_stack);
            return cb_message_page_with_history($$$Precision_suggestor_done, T);
        }
        final SubLObject state = stacks.stack_peek(cb_precision_suggestor_state_stack);
        final SubLObject pcase_var;
        final SubLObject suggestions = pcase_var = cb_generate_precision_suggestions(state);
        if (pcase_var.eql(NIL)) {
            stacks.stack_pop(cb_precision_suggestor_state_stack);
            final SubLObject new_state = new_cb_precision_suggestor_state_if_suggestions_rejected(state);
            stacks.stack_push(new_state, cb_precision_suggestor_state_stack);
            return cb_precision_suggest_next(cb_precision_suggestor_state_stack);
        }
        if (pcase_var.eql($DONE)) {
            stacks.stack_pop(cb_precision_suggestor_state_stack);
            cb_precision_suggest_done(state);
            return cb_precision_suggest_next(cb_precision_suggestor_state_stack);
        }
        return cb_show_precision_suggestions(cb_precision_suggestor_state_stack);
    }

    public static SubLObject cb_precision_suggest_done(final SubLObject state) {
        final SubLObject current_formula = cb_pss_current_formula(state);
        final SubLObject current_mt = cb_pss_current_mt(state);
        final SubLObject original_formula = cb_pss_original_formula(state);
        final SubLObject original_mt = cb_pss_original_mt(state);
        if ((!current_formula.equal(original_formula)) || (!current_mt.equal(original_mt))) {
            final SubLObject successP = ke.ke_assert_now(current_formula, current_mt, UNPROVIDED, UNPROVIDED);
            if (NIL != successP) {
                final SubLObject original_assertion = kb_indexing.find_gaf(original_formula, original_mt);
                if (NIL != original_assertion) {
                    ke.ke_unassert_assertion(original_assertion);
                }
                cb_tools.cb_add_sentence_in_mt_to_assertion_history(current_formula, current_mt);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_precision_suggestions(final SubLObject stack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject suggestions = cb_pss_suggestions(state);
        final SubLObject current_formula = cb_pss_current_formula(state);
        final SubLObject current_mt = cb_pss_current_mt(state);
        final SubLObject stack_id = cb_glob_id(stack);
        final SubLObject state_id = cb_glob_id(state);
        final SubLObject title_var = $$$Precision_Suggestor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str14$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str19$yui_skin_sam);
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
                            html_hidden_input($str25$cb_handle_precision_suggest, T, UNPROVIDED);
                            html_hidden_input($str26$stack_id, stack_id, UNPROVIDED);
                            html_hidden_input($str27$state_id, state_id, UNPROVIDED);
                            html_princ($str28$The_following_are_more_precise_ve);
                            html_newline(UNPROVIDED);
                            cb_form(current_formula, ZERO_INTEGER, T);
                            html_princ($$$_in_);
                            cb_form(current_mt, UNPROVIDED, UNPROVIDED);
                            html_princ($str30$_);
                            html_newline(UNPROVIDED);
                            html_princ($str31$Select_all_that_are_true__possibl);
                            html_newline(TWO_INTEGER);
                            if (NIL != cb_precision_suggestor_state_possibly_initialP(state)) {
                                html_princ($str32$_Warning___If_there_are_meta_asse);
                                html_newline(TWO_INTEGER);
                            }
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject bgcolor = NIL;
                                SubLObject color_toggle = NIL;
                                SubLObject list_var = NIL;
                                SubLObject suggestion = NIL;
                                SubLObject index = NIL;
                                list_var = suggestions;
                                suggestion = list_var.first();
                                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , suggestion = list_var.first() , index = add(ONE_INTEGER, index)) {
                                    if (NIL != color_toggle) {
                                        color_toggle = NIL;
                                    } else {
                                        color_toggle = T;
                                    }
                                    bgcolor = (NIL != color_toggle) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue();
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(bgcolor);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_checkbox_input(string_utilities.to_string(index), T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_indent(TWO_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_form(suggestion, ZERO_INTEGER, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject cb_handle_precision_suggest(final SubLObject args) {
        final SubLObject stack_id = html_extract_input($str26$stack_id, args);
        final SubLObject stack = cb_glob_lookup_by_string(stack_id);
        if ((NIL == stacks.stack_p(stack)) || (NIL != stacks.stack_empty_p(stack))) {
            return cb_precision_suggestor_stale_page_submitted();
        }
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject state_id_expected = html_extract_input($str27$state_id, args);
        final SubLObject state_id_actual = cb_glob_id(state);
        if (!state_id_actual.numE(string_utilities.string_to_integer(state_id_expected))) {
            return cb_precision_suggestor_stale_page_submitted();
        }
        stacks.stack_pop(stack);
        cb_glob_remove_id(state_id_actual);
        final SubLObject suggestions = cb_pss_suggestions(state);
        SubLObject selected_suggestions = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject this_selectedP;
        for (cdotimes_end_var = length(suggestions), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            this_selectedP = html_extract_input(string_utilities.to_string(i), args);
            if (this_selectedP.equalp($$$t)) {
                selected_suggestions = cons(nth(i, suggestions), selected_suggestions);
            }
        }
        if (NIL != list_utilities.empty_list_p(selected_suggestions)) {
            final SubLObject new_state = new_cb_precision_suggestor_state_if_suggestions_rejected(state);
            stacks.stack_push(new_state, stack);
        } else {
            SubLObject cdolist_list_var = selected_suggestions;
            SubLObject selected_suggestion = NIL;
            selected_suggestion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mt = cb_pss_current_mt(state);
                final SubLObject new_state2 = new_cb_precision_suggestor_state_for_selected_suggestion(state, selected_suggestion, mt);
                stacks.stack_push(new_state2, stack);
                cdolist_list_var = cdolist_list_var.rest();
                selected_suggestion = cdolist_list_var.first();
            } 
        }
        return cb_precision_suggest_next(stack);
    }

    public static SubLObject cb_precision_suggestor_stale_page_submitted() {
        return cb_error($str36$You_submitted_a_stale_Precision_S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_precision_suggestor_state_stack_p(final SubLObject v_object) {
        return stacks.stack_of_type_p(symbol_function(CB_PRECISION_SUGGESTOR_STATE_P), v_object);
    }

    public static SubLObject cb_precision_suggestor_pending_stacks() {
        return cb_glob_find_all_if(symbol_function(CB_PRECISION_SUGGESTOR_STATE_STACK_P));
    }

    public static SubLObject cb_link_precision_suggestor(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str42$_Precis_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str44$cb_restart_precision_suggestor);
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_restart_precision_suggestor(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Precision_Suggestor);
        } else {
            cb_restart_precision_suggestor_internal();
        }
        return NIL;
    }

    public static SubLObject cb_restart_precision_suggestor_internal() {
        final SubLObject v_stacks = cb_precision_suggestor_pending_stacks();
        if (NIL != list_utilities.empty_list_p(v_stacks)) {
            return cb_message_page_with_history($str48$There_are_no_unfinished_Precision, NIL);
        }
        return cb_restart_precision_suggestor_guts(v_stacks);
    }

    public static SubLObject cb_restart_precision_suggestor_guts(final SubLObject v_stacks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_empty_list_p(v_stacks) : "list_utilities.non_empty_list_p(v_stacks) " + "CommonSymbols.NIL != list_utilities.non_empty_list_p(v_stacks) " + v_stacks;
        assert NIL != list_utilities.non_dotted_list_p(v_stacks) : "list_utilities.non_dotted_list_p(v_stacks) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_stacks) " + v_stacks;
        SubLObject cdolist_list_var = v_stacks;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cb_precision_suggestor_state_stack_p(elem) : "cb_precision_suggestor.cb_precision_suggestor_state_stack_p(elem) " + "CommonSymbols.NIL != cb_precision_suggestor.cb_precision_suggestor_state_stack_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject title_var = $$$Precision_Suggestor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str14$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str19$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
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
                        html_script_utilities.cb_hoverover_page_init();
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
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str51$cb_handle_precision_suggestor_res, T, UNPROVIDED);
                            final SubLObject size_val = FOUR_INTEGER;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != size_val) {
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(size_val);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_query.cb_princ_strong_with_explanation($$$Unfinished_sessions, $str53$Resume_or_destroy_unfinished_Prec, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_indent(FOUR_INTEGER);
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str54$__A_total_, length(v_stacks));
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_indent(FOUR_INTEGER);
                            cb_link($DESTROY_ALL_PRECISION_SUGGEST, v_stacks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Actions);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = NIL;
                                    stack = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_link($RESUME_PRECISION_SUGGEST, stack, NIL, stacks.stack_empty_p(stack), UNPROVIDED, UNPROVIDED);
                                            html_indent(UNPROVIDED);
                                            cb_link($DESTROY_PRECISION_SUGGEST, stack, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Original_assertion);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = NIL;
                                    stack = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_precision_suggestor_show_original_assertion(stack);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Current_formula);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = NIL;
                                    stack = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_precision_suggestor_show_current_formula(stack);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Leaves);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = v_stacks;
                                    SubLObject stack = NIL;
                                    stack = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(stacks.stack_size(stack));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        stack = cdolist_list_var2.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$10, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_resume_precision_suggest(final SubLObject stack, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str64$_Resume_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str65$cb_resume_precision_suggest__a, cb_glob_id(stack));
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
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return stack;
    }

    public static SubLObject cb_resume_precision_suggest(final SubLObject args) {
        SubLObject id = NIL;
        destructuring_bind_must_consp(args, args, $list6);
        id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list6);
            return NIL;
        }
        final SubLObject stack = cb_glob_lookup_by_string(id);
        if ((NIL == stacks.stack_p(stack)) || (NIL != stacks.stack_empty_p(stack))) {
            return cb_error($str67$You_attempted_to_resume_a_Precisi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_show_precision_suggestions(stack);
    }

    public static SubLObject cb_link_destroy_precision_suggest(final SubLObject stack, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str69$_Destroy_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str70$cb_destroy_precision_suggest__a, cb_glob_id(stack));
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return stack;
    }

    public static SubLObject cb_destroy_precision_suggest(final SubLObject args) {
        SubLObject id_as_string = NIL;
        destructuring_bind_must_consp(args, args, $list72);
        id_as_string = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject id = string_utilities.string_to_integer(id_as_string);
            final SubLObject stack = cb_glob_lookup(id);
            cb_glob_remove_id(id);
            stacks.clear_stack(stack);
        } else {
            cdestructuring_bind_error(args, $list72);
        }
        return cb_restart_precision_suggestor_internal();
    }

    public static SubLObject cb_link_destroy_all_precision_suggest(final SubLObject v_stacks, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str74$_Destroy_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str75$cb_destroy_all_precision_suggest_, cb_glob_id(v_stacks));
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
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_stacks;
    }

    public static SubLObject cb_destroy_all_precision_suggest(final SubLObject args) {
        SubLObject id_as_string = NIL;
        destructuring_bind_must_consp(args, args, $list72);
        id_as_string = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject id = string_utilities.string_to_integer(id_as_string);
            final SubLObject v_stacks = cb_glob_lookup(id);
            cb_glob_remove_id(id);
            SubLObject cdolist_list_var = v_stacks;
            SubLObject stack = NIL;
            stack = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_glob_remove(stack);
                cdolist_list_var = cdolist_list_var.rest();
                stack = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(args, $list72);
        }
        return cb_message_page_with_history($$$Precision_suggestor_done, T);
    }

    public static SubLObject cb_precision_suggestor_show_original_assertion(final SubLObject stack) {
        if (NIL != stacks.stack_empty_p(stack)) {
            return html_princ($str78$None_);
        }
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject original_formula = cb_pss_original_formula(state);
        final SubLObject original_mt = cb_pss_original_mt(state);
        return cb_precision_suggestor_show_formula(original_formula, original_mt);
    }

    public static SubLObject cb_precision_suggestor_show_current_formula(final SubLObject stack) {
        if (NIL != stacks.stack_empty_p(stack)) {
            return html_princ($str78$None_);
        }
        final SubLObject state = stacks.stack_peek(stack);
        final SubLObject current_formula = cb_pss_current_formula(state);
        final SubLObject current_mt = cb_pss_current_mt(state);
        return cb_precision_suggestor_show_formula(current_formula, current_mt);
    }

    public static SubLObject cb_precision_suggestor_show_formula(final SubLObject sentence, final SubLObject mt) {
        html_princ_strong($str79$Mt__);
        html_indent(UNPROVIDED);
        cb_form(mt, ZERO_INTEGER, NIL);
        html_newline(UNPROVIDED);
        html_princ_strong($str80$Sentence__);
        html_newline(UNPROVIDED);
        cb_form(sentence, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_precision_suggestor_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cb_precision_suggestor_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cb_precision_suggestor_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$cb_precision_suggestor_state_native.class ? T : NIL;
    }

    public static SubLObject cb_pss_original_formula(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cb_pss_original_mt(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cb_pss_current_formula(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject cb_pss_current_mt(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject cb_pss_suggestions(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject cb_pss_precision_suggestion_function(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject cb_pss_implementation_specific_state_update_function(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject cb_pss_implementation_specific_state(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_cb_pss_original_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cb_pss_original_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cb_pss_current_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cb_pss_current_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cb_pss_suggestions(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_cb_pss_precision_suggestion_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_cb_pss_implementation_specific_state_update_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_cb_pss_implementation_specific_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_cb_precision_suggestor_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cb_precision_suggestor_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ORIGINAL_FORMULA)) {
                _csetf_cb_pss_original_formula(v_new, current_value);
            } else
                if (pcase_var.eql($ORIGINAL_MT)) {
                    _csetf_cb_pss_original_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($CURRENT_FORMULA)) {
                        _csetf_cb_pss_current_formula(v_new, current_value);
                    } else
                        if (pcase_var.eql($CURRENT_MT)) {
                            _csetf_cb_pss_current_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($SUGGESTIONS)) {
                                _csetf_cb_pss_suggestions(v_new, current_value);
                            } else
                                if (pcase_var.eql($PRECISION_SUGGESTION_FUNCTION)) {
                                    _csetf_cb_pss_precision_suggestion_function(v_new, current_value);
                                } else
                                    if (pcase_var.eql($IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION)) {
                                        _csetf_cb_pss_implementation_specific_state_update_function(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($IMPLEMENTATION_SPECIFIC_STATE)) {
                                            _csetf_cb_pss_implementation_specific_state(v_new, current_value);
                                        } else {
                                            Errors.error($str113$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cb_precision_suggestor_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CB_PRECISION_SUGGESTOR_STATE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ORIGINAL_FORMULA, cb_pss_original_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $ORIGINAL_MT, cb_pss_original_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_FORMULA, cb_pss_current_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_MT, cb_pss_current_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $SUGGESTIONS, cb_pss_suggestions(obj));
        funcall(visitor_fn, obj, $SLOT, $PRECISION_SUGGESTION_FUNCTION, cb_pss_precision_suggestion_function(obj));
        funcall(visitor_fn, obj, $SLOT, $IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, cb_pss_implementation_specific_state_update_function(obj));
        funcall(visitor_fn, obj, $SLOT, $IMPLEMENTATION_SPECIFIC_STATE, cb_pss_implementation_specific_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_CB_PRECISION_SUGGESTOR_STATE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cb_precision_suggestor_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_precision_suggestor_state(obj, visitor_fn);
    }

    public static SubLObject print_cb_precision_suggestor_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = cb_pss_current_formula(v_object);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, $str119$_S, formula);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return NIL;
    }

    public static SubLObject cb_precision_suggestor_state_possibly_initialP(final SubLObject cb_precision_suggestor_state) {
        final SubLObject current_formula = cb_pss_current_formula(cb_precision_suggestor_state);
        final SubLObject current_mt = cb_pss_current_mt(cb_precision_suggestor_state);
        final SubLObject original_formula = cb_pss_original_formula(cb_precision_suggestor_state);
        final SubLObject original_mt = cb_pss_original_mt(cb_precision_suggestor_state);
        return makeBoolean(current_formula.equal(original_formula) && current_mt.equal(original_mt));
    }

    public static SubLObject cb_generate_precision_suggestions(final SubLObject cb_precision_suggestor_state) {
        final SubLObject precision_suggestion_function = cb_pss_precision_suggestion_function(cb_precision_suggestor_state);
        final SubLObject suggestions = funcall(precision_suggestion_function, cb_precision_suggestor_state);
        _csetf_cb_pss_suggestions(cb_precision_suggestor_state, suggestions);
        return suggestions;
    }

    public static SubLObject new_cb_precision_suggestor_initial_state(final SubLObject formula, final SubLObject mt) {
        SubLObject current;
        final SubLObject datum = current = cb_current_precision_suggestion_implementation_properties();
        SubLObject name = NIL;
        SubLObject precision_suggestion_function = NIL;
        SubLObject initial_implementation_specific_state_function = NIL;
        SubLObject implementation_specific_state_update_function = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        precision_suggestion_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        initial_implementation_specific_state_function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        implementation_specific_state_update_function = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject implementation_specific_state = funcall(initial_implementation_specific_state_function);
            return make_cb_precision_suggestor_state(list(new SubLObject[]{ $ORIGINAL_FORMULA, formula, $ORIGINAL_MT, mt, $CURRENT_FORMULA, formula, $CURRENT_MT, mt, $PRECISION_SUGGESTION_FUNCTION, precision_suggestion_function, $IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, implementation_specific_state_update_function, $IMPLEMENTATION_SPECIFIC_STATE, implementation_specific_state }));
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject new_cb_precision_suggestor_state_for_selected_suggestion(final SubLObject old_cb_precision_suggestor_state, final SubLObject formula, final SubLObject mt) {
        final SubLObject new_original_formula = cb_pss_original_formula(old_cb_precision_suggestor_state);
        final SubLObject new_original_mt = cb_pss_original_mt(old_cb_precision_suggestor_state);
        final SubLObject new_precision_suggestion_function = cb_pss_precision_suggestion_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state_update_function = cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state = funcall(cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state), old_cb_precision_suggestor_state, T);
        return make_cb_precision_suggestor_state(list(new SubLObject[]{ $ORIGINAL_FORMULA, new_original_formula, $ORIGINAL_MT, new_original_mt, $CURRENT_FORMULA, formula, $CURRENT_MT, mt, $PRECISION_SUGGESTION_FUNCTION, new_precision_suggestion_function, $IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, new_implementation_specific_state_update_function, $IMPLEMENTATION_SPECIFIC_STATE, new_implementation_specific_state }));
    }

    public static SubLObject new_cb_precision_suggestor_state_if_suggestions_rejected(final SubLObject old_cb_precision_suggestor_state) {
        final SubLObject new_original_formula = cb_pss_original_formula(old_cb_precision_suggestor_state);
        final SubLObject new_original_mt = cb_pss_original_mt(old_cb_precision_suggestor_state);
        final SubLObject new_current_formula = cb_pss_current_formula(old_cb_precision_suggestor_state);
        final SubLObject new_current_mt = cb_pss_current_mt(old_cb_precision_suggestor_state);
        final SubLObject new_precision_suggestion_function = cb_pss_precision_suggestion_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state_update_function = cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state);
        final SubLObject new_implementation_specific_state = funcall(cb_pss_implementation_specific_state_update_function(old_cb_precision_suggestor_state), old_cb_precision_suggestor_state, NIL);
        return make_cb_precision_suggestor_state(list(new SubLObject[]{ $ORIGINAL_FORMULA, new_original_formula, $ORIGINAL_MT, new_original_mt, $CURRENT_FORMULA, new_current_formula, $CURRENT_MT, new_current_mt, $PRECISION_SUGGESTION_FUNCTION, new_precision_suggestion_function, $IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, new_implementation_specific_state_update_function, $IMPLEMENTATION_SPECIFIC_STATE, new_implementation_specific_state }));
    }

    public static SubLObject cb_current_precision_suggestion_implementation_properties() {
        return cb_precision_suggestion_implementation_properties($cb_current_precision_suggestion_implementation$.getGlobalValue());
    }

    public static SubLObject cb_precision_suggestion_implementations() {
        return copy_list($cb_precision_suggestion_implementations$.getGlobalValue());
    }

    public static SubLObject cb_precision_suggestion_implementation_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cb_precision_suggestion_implementations$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR));
    }

    public static SubLObject cb_precision_suggestion_implementation_properties(final SubLObject implementation) {
        return list_utilities.alist_lookup($cb_precision_suggestion_implementations$.getGlobalValue(), implementation, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_cb_precision_suggestion_implementation(final SubLObject implementation, final SubLObject name, final SubLObject precision_suggestion_function, final SubLObject initial_implementation_specific_state_function, final SubLObject implementation_specific_state_update_function) {
        undeclare_cb_precision_suggestion_implementation(implementation);
        $cb_precision_suggestion_implementations$.setGlobalValue(cons(cons(implementation, list(name, precision_suggestion_function, initial_implementation_specific_state_function, implementation_specific_state_update_function)), $cb_precision_suggestion_implementations$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject undeclare_cb_precision_suggestion_implementation(final SubLObject implementation) {
        $cb_precision_suggestion_implementations$.setGlobalValue(delete(implementation, $cb_precision_suggestion_implementations$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return implementation;
    }

    public static SubLObject cb_inference_precision_suggestion_function(final SubLObject cb_precision_suggestor_state) {
        final SubLObject inference_state = cb_pss_implementation_specific_state(cb_precision_suggestor_state);
        final SubLObject formula = cb_pss_current_formula(cb_precision_suggestor_state);
        final SubLObject mt = cb_pss_current_mt(cb_precision_suggestor_state);
        return NIL != inference_state ? inference_precision_suggest(formula, mt) : $DONE;
    }

    public static SubLObject inference_precision_suggest(final SubLObject formula, final SubLObject mt) {
        final SubLObject pred = constants_high.find_constant($$$keStrengtheningSuggestion);
        if (NIL != valid_constantP(pred, UNPROVIDED)) {
            return ask_utilities.query_variable($sym131$_STRONG, make_ternary_formula($$and, make_binary_formula(pred, formula, $sym131$_STRONG), $$True, $$True), mt, $list134);
        }
        return NIL;
    }

    public static SubLObject cb_precision_suggestor_initial_inference_state() {
        return T;
    }

    public static SubLObject cb_precision_suggestor_inference_state_update_function(final SubLObject old_cb_precision_suggestor_state, final SubLObject suggestion_acceptedP) {
        return list_utilities.sublisp_boolean(suggestion_acceptedP);
    }

    public static SubLObject cb_rkf_precision_suggestion_function(final SubLObject cb_precision_suggestor_state) {
        final SubLObject rkf_state = cb_pss_implementation_specific_state(cb_precision_suggestor_state);
        final SubLObject formula = cb_pss_current_formula(cb_precision_suggestor_state);
        final SubLObject mt = cb_pss_current_mt(cb_precision_suggestor_state);
        final SubLObject argnum = cb_ps_rkf_s_next_arg_to_precisify(rkf_state);
        final SubLObject direction = cb_ps_rkf_s_next_direction_to_precisify(rkf_state);
        if (NIL == argnum) {
            return $DONE;
        }
        return cb_precisify_argument_candidates(formula, mt, argnum, direction, UNPROVIDED);
    }

    public static SubLObject cb_precision_suggestor_rkf_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cb_precision_suggestor_rkf_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$cb_precision_suggestor_rkf_state_native.class ? T : NIL;
    }

    public static SubLObject cb_ps_rkf_s_next_arg_to_precisify(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_rkf_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_rkf_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cb_ps_rkf_s_next_direction_to_precisify(final SubLObject v_object) {
        assert NIL != cb_precision_suggestor_rkf_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_rkf_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_cb_ps_rkf_s_next_arg_to_precisify(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_rkf_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_rkf_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cb_ps_rkf_s_next_direction_to_precisify(final SubLObject v_object, final SubLObject value) {
        assert NIL != cb_precision_suggestor_rkf_state_p(v_object) : "cb_precision_suggestor.cb_precision_suggestor_rkf_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_cb_precision_suggestor_rkf_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cb_precision_suggestor_rkf_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEXT_ARG_TO_PRECISIFY)) {
                _csetf_cb_ps_rkf_s_next_arg_to_precisify(v_new, current_value);
            } else
                if (pcase_var.eql($NEXT_DIRECTION_TO_PRECISIFY)) {
                    _csetf_cb_ps_rkf_s_next_direction_to_precisify(v_new, current_value);
                } else {
                    Errors.error($str113$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cb_precision_suggestor_rkf_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NEXT_ARG_TO_PRECISIFY, cb_ps_rkf_s_next_arg_to_precisify(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT_DIRECTION_TO_PRECISIFY, cb_ps_rkf_s_next_direction_to_precisify(obj));
        funcall(visitor_fn, obj, $END, MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cb_precision_suggestor_rkf_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_precision_suggestor_rkf_state(obj, visitor_fn);
    }

    public static SubLObject cb_precision_suggestor_initial_rkf_state() {
        return make_cb_precision_suggestor_rkf_state(list($NEXT_ARG_TO_PRECISIFY, ONE_INTEGER, $NEXT_DIRECTION_TO_PRECISIFY, $GENERALIZE));
    }

    public static SubLObject cb_precision_suggestor_rkf_state_update_function(final SubLObject old_cb_precision_suggestor_state, final SubLObject suggestion_acceptedP) {
        final SubLObject old_rkf_state = cb_pss_implementation_specific_state(old_cb_precision_suggestor_state);
        if (NIL != suggestion_acceptedP) {
            return copy_cb_precision_suggestor_rkf_state(old_rkf_state);
        }
        final SubLObject formula = cb_pss_current_formula(old_cb_precision_suggestor_state);
        final SubLObject v_arity = formula_arity(formula, UNPROVIDED);
        final SubLObject old_next_arg_to_precisify = cb_ps_rkf_s_next_arg_to_precisify(old_rkf_state);
        final SubLObject old_next_direction_to_precisify = cb_ps_rkf_s_next_direction_to_precisify(old_rkf_state);
        final SubLObject new_next_direction_to_precisify = (old_next_direction_to_precisify == $GENERALIZE) ? $SPECIALIZE : $GENERALIZE;
        final SubLObject new_next_arg_to_precisify = (new_next_direction_to_precisify == $GENERALIZE) ? old_next_arg_to_precisify.numGE(v_arity) ? NIL : number_utilities.f_1X(old_next_arg_to_precisify) : old_next_arg_to_precisify;
        return make_cb_precision_suggestor_rkf_state(list($NEXT_ARG_TO_PRECISIFY, new_next_arg_to_precisify, $NEXT_DIRECTION_TO_PRECISIFY, new_next_direction_to_precisify));
    }

    public static SubLObject copy_cb_precision_suggestor_rkf_state(final SubLObject cb_precision_suggestor_rkf_state) {
        final SubLObject next_arg_to_precisify = cb_ps_rkf_s_next_arg_to_precisify(cb_precision_suggestor_rkf_state);
        final SubLObject next_direction_to_precisify = cb_ps_rkf_s_next_direction_to_precisify(cb_precision_suggestor_rkf_state);
        return make_cb_precision_suggestor_rkf_state(list($NEXT_ARG_TO_PRECISIFY, next_arg_to_precisify, $NEXT_DIRECTION_TO_PRECISIFY, next_direction_to_precisify));
    }

    public static SubLObject cb_uia_precisify_argument_candidates_subsumption_preds(final SubLObject generalizeP, final SubLObject preds) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = cb_uia_precisify_argument_candidates_subsumption_pred_for_pred(generalizeP, pred);
            if (NIL != var) {
                ans = cons(var, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject cb_uia_precisify_argument_candidates_subsumption_pred_for_pred(final SubLObject generalizeP, final SubLObject pred) {
        if (pred.eql($$genls)) {
            return NIL != generalizeP ? $sym159$GENL_ : $sym160$SPEC_;
        }
        if (pred.eql($$genlPreds)) {
            return NIL != generalizeP ? $sym162$GENL_PREDICATE_ : $sym163$SPEC_PREDICATE_;
        }
        return NIL;
    }

    public static SubLObject cb_precisify_argument_candidates(final SubLObject formula, final SubLObject mt, final SubLObject argnum, final SubLObject direction, SubLObject type_col) {
        if (type_col == UNPROVIDED) {
            type_col = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == possibly_atomic_sentence_p(formula)) || (NIL == fort_types_interface.predicateP(cycl_utilities.sentence_arg(formula, ZERO_INTEGER, UNPROVIDED)))) {
            return NIL;
        }
        SubLObject result_sentences = NIL;
        final SubLObject generalizeP = eq(direction, $GENERALIZE);
        final SubLObject preds = rkf_precision_suggestor.rkf_sentence_arg_precisification_options(formula, mt, argnum, generalizeP);
        final SubLObject original_arg = cycl_utilities.sentence_arg(formula, argnum, UNPROVIDED);
        if (NIL == preds) {
            return NIL;
        }
        SubLObject suggestions = rkf_precision_suggestor.rkf_raw_precisify_arg(formula, argnum, mt, generalizeP, original_arg, preds, type_col);
        final SubLObject mode = (NIL != generalizeP) ? $ASCENDING : $DESCENDING;
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
            SubLObject subsumption_pred = NIL;
            subsumption_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                suggestions = list_utilities.delete_subsumed_items(suggestions, subsumption_pred, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                subsumption_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = cardinality_estimates.sort_by_generality_estimate(suggestions, mode);
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            result_sentences = cons(replace_formula_arg(argnum, suggestion, formula), result_sentences);
            cdolist_list_var2 = cdolist_list_var2.rest();
            suggestion = cdolist_list_var2.first();
        } 
        result_sentences = delete_if(symbol_function(CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION), result_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result_sentences;
    }

    public static SubLObject cb_precision_suggestor_redundant_suggestion(final SubLObject sentence) {
        return makeBoolean((NIL != kb_utilities.kbeq($$genls, cycl_utilities.formula_arg0(sentence))) && cycl_utilities.formula_arg1(sentence, UNPROVIDED).equal(cycl_utilities.formula_arg2(sentence, UNPROVIDED)));
    }

    public static SubLObject declare_cb_precision_suggestor_file() {
        declareFunction(me, "cb_link_precision_suggest", "CB-LINK-PRECISION-SUGGEST", 1, 2, false);
        declareFunction(me, "cb_precision_suggest", "CB-PRECISION-SUGGEST", 1, 0, false);
        declareFunction(me, "cb_precision_suggest_assertion", "CB-PRECISION-SUGGEST-ASSERTION", 1, 0, false);
        declareFunction(me, "cb_precision_suggest_next", "CB-PRECISION-SUGGEST-NEXT", 1, 0, false);
        declareFunction(me, "cb_precision_suggest_done", "CB-PRECISION-SUGGEST-DONE", 1, 0, false);
        declareFunction(me, "cb_show_precision_suggestions", "CB-SHOW-PRECISION-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "cb_handle_precision_suggest", "CB-HANDLE-PRECISION-SUGGEST", 1, 0, false);
        declareFunction(me, "cb_precision_suggestor_stale_page_submitted", "CB-PRECISION-SUGGESTOR-STALE-PAGE-SUBMITTED", 0, 0, false);
        declareFunction(me, "cb_precision_suggestor_state_stack_p", "CB-PRECISION-SUGGESTOR-STATE-STACK-P", 1, 0, false);
        declareFunction(me, "cb_precision_suggestor_pending_stacks", "CB-PRECISION-SUGGESTOR-PENDING-STACKS", 0, 0, false);
        declareFunction(me, "cb_link_precision_suggestor", "CB-LINK-PRECISION-SUGGESTOR", 0, 1, false);
        declareFunction(me, "cb_restart_precision_suggestor", "CB-RESTART-PRECISION-SUGGESTOR", 0, 1, false);
        declareFunction(me, "cb_restart_precision_suggestor_internal", "CB-RESTART-PRECISION-SUGGESTOR-INTERNAL", 0, 0, false);
        declareFunction(me, "cb_restart_precision_suggestor_guts", "CB-RESTART-PRECISION-SUGGESTOR-GUTS", 1, 0, false);
        declareFunction(me, "cb_link_resume_precision_suggest", "CB-LINK-RESUME-PRECISION-SUGGEST", 1, 2, false);
        declareFunction(me, "cb_resume_precision_suggest", "CB-RESUME-PRECISION-SUGGEST", 1, 0, false);
        declareFunction(me, "cb_link_destroy_precision_suggest", "CB-LINK-DESTROY-PRECISION-SUGGEST", 1, 1, false);
        declareFunction(me, "cb_destroy_precision_suggest", "CB-DESTROY-PRECISION-SUGGEST", 1, 0, false);
        declareFunction(me, "cb_link_destroy_all_precision_suggest", "CB-LINK-DESTROY-ALL-PRECISION-SUGGEST", 1, 1, false);
        declareFunction(me, "cb_destroy_all_precision_suggest", "CB-DESTROY-ALL-PRECISION-SUGGEST", 1, 0, false);
        declareFunction(me, "cb_precision_suggestor_show_original_assertion", "CB-PRECISION-SUGGESTOR-SHOW-ORIGINAL-ASSERTION", 1, 0, false);
        declareFunction(me, "cb_precision_suggestor_show_current_formula", "CB-PRECISION-SUGGESTOR-SHOW-CURRENT-FORMULA", 1, 0, false);
        declareFunction(me, "cb_precision_suggestor_show_formula", "CB-PRECISION-SUGGESTOR-SHOW-FORMULA", 2, 0, false);
        declareFunction(me, "cb_precision_suggestor_state_print_function_trampoline", "CB-PRECISION-SUGGESTOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cb_precision_suggestor_state_p", "CB-PRECISION-SUGGESTOR-STATE-P", 1, 0, false);
        new cb_precision_suggestor.$cb_precision_suggestor_state_p$UnaryFunction();
        declareFunction(me, "cb_pss_original_formula", "CB-PSS-ORIGINAL-FORMULA", 1, 0, false);
        declareFunction(me, "cb_pss_original_mt", "CB-PSS-ORIGINAL-MT", 1, 0, false);
        declareFunction(me, "cb_pss_current_formula", "CB-PSS-CURRENT-FORMULA", 1, 0, false);
        declareFunction(me, "cb_pss_current_mt", "CB-PSS-CURRENT-MT", 1, 0, false);
        declareFunction(me, "cb_pss_suggestions", "CB-PSS-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "cb_pss_precision_suggestion_function", "CB-PSS-PRECISION-SUGGESTION-FUNCTION", 1, 0, false);
        declareFunction(me, "cb_pss_implementation_specific_state_update_function", "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION", 1, 0, false);
        declareFunction(me, "cb_pss_implementation_specific_state", "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE", 1, 0, false);
        declareFunction(me, "_csetf_cb_pss_original_formula", "_CSETF-CB-PSS-ORIGINAL-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_original_mt", "_CSETF-CB-PSS-ORIGINAL-MT", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_current_formula", "_CSETF-CB-PSS-CURRENT-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_current_mt", "_CSETF-CB-PSS-CURRENT-MT", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_suggestions", "_CSETF-CB-PSS-SUGGESTIONS", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_precision_suggestion_function", "_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_implementation_specific_state_update_function", "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION", 2, 0, false);
        declareFunction(me, "_csetf_cb_pss_implementation_specific_state", "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE", 2, 0, false);
        declareFunction(me, "make_cb_precision_suggestor_state", "MAKE-CB-PRECISION-SUGGESTOR-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_cb_precision_suggestor_state", "VISIT-DEFSTRUCT-CB-PRECISION-SUGGESTOR-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cb_precision_suggestor_state_method", "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-STATE-METHOD", 2, 0, false);
        declareFunction(me, "print_cb_precision_suggestor_state", "PRINT-CB-PRECISION-SUGGESTOR-STATE", 3, 0, false);
        declareFunction(me, "cb_precision_suggestor_state_possibly_initialP", "CB-PRECISION-SUGGESTOR-STATE-POSSIBLY-INITIAL?", 1, 0, false);
        declareFunction(me, "cb_generate_precision_suggestions", "CB-GENERATE-PRECISION-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "new_cb_precision_suggestor_initial_state", "NEW-CB-PRECISION-SUGGESTOR-INITIAL-STATE", 2, 0, false);
        declareFunction(me, "new_cb_precision_suggestor_state_for_selected_suggestion", "NEW-CB-PRECISION-SUGGESTOR-STATE-FOR-SELECTED-SUGGESTION", 3, 0, false);
        declareFunction(me, "new_cb_precision_suggestor_state_if_suggestions_rejected", "NEW-CB-PRECISION-SUGGESTOR-STATE-IF-SUGGESTIONS-REJECTED", 1, 0, false);
        declareFunction(me, "cb_current_precision_suggestion_implementation_properties", "CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION-PROPERTIES", 0, 0, false);
        declareFunction(me, "cb_precision_suggestion_implementations", "CB-PRECISION-SUGGESTION-IMPLEMENTATIONS", 0, 0, false);
        declareFunction(me, "cb_precision_suggestion_implementation_p", "CB-PRECISION-SUGGESTION-IMPLEMENTATION-P", 1, 0, false);
        declareFunction(me, "cb_precision_suggestion_implementation_properties", "CB-PRECISION-SUGGESTION-IMPLEMENTATION-PROPERTIES", 1, 0, false);
        declareFunction(me, "declare_cb_precision_suggestion_implementation", "DECLARE-CB-PRECISION-SUGGESTION-IMPLEMENTATION", 5, 0, false);
        declareFunction(me, "undeclare_cb_precision_suggestion_implementation", "UNDECLARE-CB-PRECISION-SUGGESTION-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "cb_inference_precision_suggestion_function", "CB-INFERENCE-PRECISION-SUGGESTION-FUNCTION", 1, 0, false);
        declareFunction(me, "inference_precision_suggest", "INFERENCE-PRECISION-SUGGEST", 2, 0, false);
        declareFunction(me, "cb_precision_suggestor_initial_inference_state", "CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE", 0, 0, false);
        declareFunction(me, "cb_precision_suggestor_inference_state_update_function", "CB-PRECISION-SUGGESTOR-INFERENCE-STATE-UPDATE-FUNCTION", 2, 0, false);
        declareFunction(me, "cb_rkf_precision_suggestion_function", "CB-RKF-PRECISION-SUGGESTION-FUNCTION", 1, 0, false);
        declareFunction(me, "cb_precision_suggestor_rkf_state_print_function_trampoline", "CB-PRECISION-SUGGESTOR-RKF-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cb_precision_suggestor_rkf_state_p", "CB-PRECISION-SUGGESTOR-RKF-STATE-P", 1, 0, false);
        new cb_precision_suggestor.$cb_precision_suggestor_rkf_state_p$UnaryFunction();
        declareFunction(me, "cb_ps_rkf_s_next_arg_to_precisify", "CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY", 1, 0, false);
        declareFunction(me, "cb_ps_rkf_s_next_direction_to_precisify", "CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY", 1, 0, false);
        declareFunction(me, "_csetf_cb_ps_rkf_s_next_arg_to_precisify", "_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY", 2, 0, false);
        declareFunction(me, "_csetf_cb_ps_rkf_s_next_direction_to_precisify", "_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY", 2, 0, false);
        declareFunction(me, "make_cb_precision_suggestor_rkf_state", "MAKE-CB-PRECISION-SUGGESTOR-RKF-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_cb_precision_suggestor_rkf_state", "VISIT-DEFSTRUCT-CB-PRECISION-SUGGESTOR-RKF-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cb_precision_suggestor_rkf_state_method", "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-RKF-STATE-METHOD", 2, 0, false);
        declareFunction(me, "cb_precision_suggestor_initial_rkf_state", "CB-PRECISION-SUGGESTOR-INITIAL-RKF-STATE", 0, 0, false);
        declareFunction(me, "cb_precision_suggestor_rkf_state_update_function", "CB-PRECISION-SUGGESTOR-RKF-STATE-UPDATE-FUNCTION", 2, 0, false);
        declareFunction(me, "copy_cb_precision_suggestor_rkf_state", "COPY-CB-PRECISION-SUGGESTOR-RKF-STATE", 1, 0, false);
        declareFunction(me, "cb_uia_precisify_argument_candidates_subsumption_preds", "CB-UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PREDS", 2, 0, false);
        declareFunction(me, "cb_uia_precisify_argument_candidates_subsumption_pred_for_pred", "CB-UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PRED-FOR-PRED", 2, 0, false);
        declareFunction(me, "cb_precisify_argument_candidates", "CB-PRECISIFY-ARGUMENT-CANDIDATES", 4, 1, false);
        declareFunction(me, "cb_precision_suggestor_redundant_suggestion", "CB-PRECISION-SUGGESTOR-REDUNDANT-SUGGESTION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_precision_suggestor_file() {
        defconstant("*DTP-CB-PRECISION-SUGGESTOR-STATE*", CB_PRECISION_SUGGESTOR_STATE);
        deflexical("*CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION*", SubLTrampolineFile.maybeDefault($cb_current_precision_suggestion_implementation$, $cb_current_precision_suggestion_implementation$, $CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION));
        deflexical("*CB-PRECISION-SUGGESTION-IMPLEMENTATIONS*", SubLTrampolineFile.maybeDefault($cb_precision_suggestion_implementations$, $cb_precision_suggestion_implementations$, NIL));
        defconstant("*DTP-CB-PRECISION-SUGGESTOR-RKF-STATE*", CB_PRECISION_SUGGESTOR_RKF_STATE);
        return NIL;
    }

    public static SubLObject setup_cb_precision_suggestor_file() {
        setup_cb_link_method($PRECISION_SUGGEST, CB_LINK_PRECISION_SUGGEST, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_PRECISION_SUGGEST, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_PRECISION_SUGGEST, $HTML_HANDLER);
        declare_cb_tool($PRECISION_SUGGESTOR, $$$Precision_Suggestor, $$$Precis, $str41$Restart_the_Precision_Suggestor_t);
        setup_cb_link_method($PRECISION_SUGGESTOR, CB_LINK_PRECISION_SUGGESTOR, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_RESTART_PRECISION_SUGGESTOR, $HTML_HANDLER);
        setup_cb_link_method($RESUME_PRECISION_SUGGEST, CB_LINK_RESUME_PRECISION_SUGGEST, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_RESUME_PRECISION_SUGGEST, $HTML_HANDLER);
        setup_cb_link_method($DESTROY_PRECISION_SUGGEST, CB_LINK_DESTROY_PRECISION_SUGGEST, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_DESTROY_PRECISION_SUGGEST, $HTML_HANDLER);
        setup_cb_link_method($DESTROY_ALL_PRECISION_SUGGEST, CB_LINK_DESTROY_ALL_PRECISION_SUGGEST, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_DESTROY_ALL_PRECISION_SUGGEST, $HTML_HANDLER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_state$.getGlobalValue(), symbol_function(CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list88);
        def_csetf(CB_PSS_ORIGINAL_FORMULA, _CSETF_CB_PSS_ORIGINAL_FORMULA);
        def_csetf(CB_PSS_ORIGINAL_MT, _CSETF_CB_PSS_ORIGINAL_MT);
        def_csetf(CB_PSS_CURRENT_FORMULA, _CSETF_CB_PSS_CURRENT_FORMULA);
        def_csetf(CB_PSS_CURRENT_MT, _CSETF_CB_PSS_CURRENT_MT);
        def_csetf(CB_PSS_SUGGESTIONS, _CSETF_CB_PSS_SUGGESTIONS);
        def_csetf(CB_PSS_PRECISION_SUGGESTION_FUNCTION, _CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION);
        def_csetf(CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, _CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION);
        def_csetf(CB_PSS_IMPLEMENTATION_SPECIFIC_STATE, _CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE);
        identity(CB_PRECISION_SUGGESTOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD));
        declare_defglobal($cb_current_precision_suggestion_implementation$);
        declare_defglobal($cb_precision_suggestion_implementations$);
        declare_cb_precision_suggestion_implementation($CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION, $str126$OE_inference_based_implementation, CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION, CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE, CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION);
        declare_cb_precision_suggestion_implementation($CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION, $$$RKF_implementation, CB_RKF_PRECISION_SUGGESTION_FUNCTION, CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE, CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_rkf_state$.getGlobalValue(), symbol_function(CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list147);
        def_csetf(CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY, _CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY);
        def_csetf(CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY, _CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY);
        identity(CB_PRECISION_SUGGESTOR_RKF_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_rkf_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD));
        return NIL;
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

    

    public static final class $cb_precision_suggestor_state_native extends SubLStructNative {
        public SubLObject $original_formula;

        public SubLObject $original_mt;

        public SubLObject $current_formula;

        public SubLObject $current_mt;

        public SubLObject $suggestions;

        public SubLObject $precision_suggestion_function;

        public SubLObject $implementation_specific_state_update_function;

        public SubLObject $implementation_specific_state;

        private static final SubLStructDeclNative structDecl;

        private $cb_precision_suggestor_state_native() {
            this.$original_formula = Lisp.NIL;
            this.$original_mt = Lisp.NIL;
            this.$current_formula = Lisp.NIL;
            this.$current_mt = Lisp.NIL;
            this.$suggestions = Lisp.NIL;
            this.$precision_suggestion_function = Lisp.NIL;
            this.$implementation_specific_state_update_function = Lisp.NIL;
            this.$implementation_specific_state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($cb_precision_suggestor_state_native.class, CB_PRECISION_SUGGESTOR_STATE, CB_PRECISION_SUGGESTOR_STATE_P, $list82, $list83, new String[]{ "$original_formula", "$original_mt", "$current_formula", "$current_mt", "$suggestions", "$precision_suggestion_function", "$implementation_specific_state_update_function", "$implementation_specific_state" }, $list84, $list85, PRINT_CB_PRECISION_SUGGESTOR_STATE);
        }
    }

    public static final class $cb_precision_suggestor_state_p$UnaryFunction extends UnaryFunction {
        public $cb_precision_suggestor_state_p$UnaryFunction() {
            super(extractFunctionNamed("CB-PRECISION-SUGGESTOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cb_precision_suggestor_state_p(arg1);
        }
    }

    public static final class $cb_precision_suggestor_rkf_state_native extends SubLStructNative {
        public SubLObject $next_arg_to_precisify;

        public SubLObject $next_direction_to_precisify;

        private static final SubLStructDeclNative structDecl;

        private $cb_precision_suggestor_rkf_state_native() {
            this.$next_arg_to_precisify = Lisp.NIL;
            this.$next_direction_to_precisify = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($cb_precision_suggestor_rkf_state_native.class, CB_PRECISION_SUGGESTOR_RKF_STATE, CB_PRECISION_SUGGESTOR_RKF_STATE_P, $list141, $list142, new String[]{ "$next_arg_to_precisify", "$next_direction_to_precisify" }, $list143, $list144, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cb_precision_suggestor_rkf_state_p$UnaryFunction extends UnaryFunction {
        public $cb_precision_suggestor_rkf_state_p$UnaryFunction() {
            super(extractFunctionNamed("CB-PRECISION-SUGGESTOR-RKF-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cb_precision_suggestor_rkf_state_p(arg1);
        }
    }
}

/**
 * Total time: 790 ms
 */
