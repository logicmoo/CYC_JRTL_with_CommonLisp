/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-LISTENERS
 *  source file: /cyc/top/cycl/uia-listeners.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class uia_listeners extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_listeners() {
    }

    public static final SubLFile me = new uia_listeners();


    // // Definitions
    public static final SubLObject define_uia_event_listener(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject event = NIL;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            event = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject variable = intern(format(NIL, $str_alt1$_UIA__A_EVENT_LISTENER_, name), UNPROVIDED);
                SubLObject method = intern(format(NIL, $str_alt2$UIA_HANDLE__A_EVENT, name), UNPROVIDED);
                return list(PROGN, listS(DEFINE_PRIVATE, method, arglist, append(body, NIL)), list(DEFLEXICAL_PRIVATE, variable, list(DESCRIBE_FUNCALL_LISTENER, event, list(QUOTE, method))), list(REGISTER_LISTENER_WITH_RKF_EVENT_DISPATCHER, variable));
            }
        }
    }

    public static final SubLObject uia_handle_add_term_to_crumb_trail_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_create_term_event_retrieve_agenda(event);
                SubLObject term_name = rkf_event_dispatcher.rkf_create_term_event_retrieve_term_name(event);
                SubLObject v_term = ke_utilities.fort_from_string(term_name);
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    user_interaction_agenda.uia_add_term_to_crumb_trail(v_agenda, v_term);
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_add_term_to_crumb_trail_event_listener$ = makeSymbol("*UIA-ADD-TERM-TO-CRUMB-TRAIL-EVENT-LISTENER*");

    public static final SubLObject uia_handle_add_assert_to_crumb_trail_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_assert_event_retrieve_agenda(event);
                SubLObject mt = rkf_event_dispatcher.rkf_assert_event_retrieve_mt(event);
                SubLObject sentence = rkf_event_dispatcher.rkf_assert_event_retrieve_sentence(event);
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    if (NIL == uia_trampolines.uia_irrelevant_sentenceP(v_agenda, sentence, UNPROVIDED)) {
                        user_interaction_agenda.uia_add_fact_to_crumb_trail(v_agenda, sentence, mt);
                    }
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_add_assert_to_crumb_trail_event_listener$ = makeSymbol("*UIA-ADD-ASSERT-TO-CRUMB-TRAIL-EVENT-LISTENER*");

    public static final SubLObject uia_handle_clear_wff_cache_unassert_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_unassert_event_retrieve_agenda(event);
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    uia_forget_previous_results_for_wff_caching_functions(v_agenda);
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_clear_wff_cache_unassert_event_listener$ = makeSymbol("*UIA-CLEAR-WFF-CACHE-UNASSERT-EVENT-LISTENER*");

    public static final SubLObject uia_handle_clear_wff_cache_assert_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_assert_event_retrieve_agenda(event);
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    uia_forget_previous_results_for_wff_caching_functions(v_agenda);
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_clear_wff_cache_assert_event_listener$ = makeSymbol("*UIA-CLEAR-WFF-CACHE-ASSERT-EVENT-LISTENER*");

    public static final SubLObject uia_forget_previous_results_for_wff_caching_functions(SubLObject v_agenda) {
        user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED);
        user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED);
        user_interaction_agenda.uia_clear_memoization_state_for_function(v_agenda, $sym18$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED);
        uia_trampolines.uia_forget_previous_results_for_assertible_compliantP(v_agenda);
        uia_trampolines.uia_forget_previous_results_for_wff_compliantP(v_agenda);
        return v_agenda;
    }

    public static final SubLObject uia_assume_kb_changes_occurred_outside_uia(SubLObject v_agenda) {
        uia_trampolines.uia_forget_previous_results_for_wff_compliantP(v_agenda);
        return v_agenda;
    }

    public static final SubLObject uia_handle_uia_update_kreviewer_assert_event_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_assert_event_retrieve_agenda(event);
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    uia_tools_review_and_testing.uia_knowledge_reviewer_note_refresh_required(v_agenda);
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_uia_update_kreviewer_assert_event_event_listener$ = makeSymbol("*UIA-UIA-UPDATE-KREVIEWER-ASSERT-EVENT-EVENT-LISTENER*");

    public static final SubLObject uia_handle_uia_update_kreviewer_unassert_event_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_unassert_event_retrieve_agenda(event);
                if (NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) {
                    uia_tools_review_and_testing.uia_knowledge_reviewer_note_refresh_required(v_agenda);
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_uia_update_kreviewer_unassert_event_event_listener$ = makeSymbol("*UIA-UIA-UPDATE-KREVIEWER-UNASSERT-EVENT-EVENT-LISTENER*");

    /**
     *
     *
     * @unknown 
     */
    public static final SubLObject agenda_with_valid_scoop_connection_p(SubLObject v_agenda) {
        return makeBoolean(((NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda)) && (NIL != rkf_collaborator_scoop.scoop_session_p(user_interaction_agenda.uia_state_lookup(v_agenda, $SCOOP_SESSION, UNPROVIDED)))) && (NIL != rkf_collaborator_scoop.scoop_session_initializedP(user_interaction_agenda.uia_state_lookup(v_agenda, $SCOOP_SESSION, UNPROVIDED))));
    }

    public static final SubLObject uia_handle_uia_update_scoop_create_term_event_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_create_term_event_retrieve_agenda(event);
                if (NIL != agenda_with_valid_scoop_connection_p(v_agenda)) {
                    rkf_collaborator_scoop.scoop_schedule_create_message(constants_high.find_constant_by_external_id(rkf_event_dispatcher.rkf_create_term_event_retrieve_term_guid(event)));
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_uia_update_scoop_create_term_event_event_listener$ = makeSymbol("*UIA-UIA-UPDATE-SCOOP-CREATE-TERM-EVENT-EVENT-LISTENER*");

    public static final SubLObject uia_handle_uia_update_scoop_kill_term_event_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_kill_term_event_retrieve_agenda(event);
                if (NIL != agenda_with_valid_scoop_connection_p(v_agenda)) {
                    rkf_collaborator_scoop.scoop_schedule_kill_message(rkf_event_dispatcher.rkf_kill_term_event_retrieve_term_name(event), rkf_event_dispatcher.rkf_kill_term_event_retrieve_term_guid(event), uia_setup_state.uia_user(v_agenda));
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_uia_update_scoop_kill_term_event_event_listener$ = makeSymbol("*UIA-UIA-UPDATE-SCOOP-KILL-TERM-EVENT-EVENT-LISTENER*");

    public static final SubLObject uia_handle_uia_update_scoop_assert_event_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_assert_event_retrieve_agenda(event);
                if (NIL != agenda_with_valid_scoop_connection_p(v_agenda)) {
                    {
                        SubLObject sentence = rkf_event_dispatcher.rkf_assert_event_retrieve_sentence(event);
                        SubLObject mt = rkf_event_dispatcher.rkf_assert_event_retrieve_mt(event);
                        SubLObject assertion = czer_meta.find_assertion_cycl(sentence, mt);
                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                            rkf_collaborator_scoop.scoop_schedule_assert_message(assertion);
                        } else {
                            Errors.warn($str_alt25$I_could_not_find_the_assertion_wi, assertion, mt);
                        }
                    }
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_uia_update_scoop_assert_event_event_listener$ = makeSymbol("*UIA-UIA-UPDATE-SCOOP-ASSERT-EVENT-EVENT-LISTENER*");

    public static final SubLObject uia_handle_uia_update_scoop_unassert_event_event(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject v_agenda = rkf_event_dispatcher.rkf_unassert_event_retrieve_agenda(event);
                if (NIL != agenda_with_valid_scoop_connection_p(v_agenda)) {
                    rkf_collaborator_scoop.scoop_schedule_unassert_message(rkf_event_dispatcher.rkf_unassert_event_retrieve_sentence(event), rkf_event_dispatcher.rkf_unassert_event_retrieve_mt(event), uia_setup_state.uia_user(v_agenda));
                }
            }
        }
        return event;
    }

    // deflexical
    private static final SubLSymbol $uia_uia_update_scoop_unassert_event_event_listener$ = makeSymbol("*UIA-UIA-UPDATE-SCOOP-UNASSERT-EVENT-EVENT-LISTENER*");

    public static final SubLObject declare_uia_listeners_file() {
        declareMacro("define_uia_event_listener", "DEFINE-UIA-EVENT-LISTENER");
        declareFunction("uia_handle_add_term_to_crumb_trail_event", "UIA-HANDLE-ADD-TERM-TO-CRUMB-TRAIL-EVENT", 1, 1, false);
        declareFunction("uia_handle_add_assert_to_crumb_trail_event", "UIA-HANDLE-ADD-ASSERT-TO-CRUMB-TRAIL-EVENT", 1, 1, false);
        declareFunction("uia_handle_clear_wff_cache_unassert_event", "UIA-HANDLE-CLEAR-WFF-CACHE-UNASSERT-EVENT", 1, 1, false);
        declareFunction("uia_handle_clear_wff_cache_assert_event", "UIA-HANDLE-CLEAR-WFF-CACHE-ASSERT-EVENT", 1, 1, false);
        declareFunction("uia_forget_previous_results_for_wff_caching_functions", "UIA-FORGET-PREVIOUS-RESULTS-FOR-WFF-CACHING-FUNCTIONS", 1, 0, false);
        declareFunction("uia_assume_kb_changes_occurred_outside_uia", "UIA-ASSUME-KB-CHANGES-OCCURRED-OUTSIDE-UIA", 1, 0, false);
        declareFunction("uia_handle_uia_update_kreviewer_assert_event_event", "UIA-HANDLE-UIA-UPDATE-KREVIEWER-ASSERT-EVENT-EVENT", 1, 1, false);
        declareFunction("uia_handle_uia_update_kreviewer_unassert_event_event", "UIA-HANDLE-UIA-UPDATE-KREVIEWER-UNASSERT-EVENT-EVENT", 1, 1, false);
        declareFunction("agenda_with_valid_scoop_connection_p", "AGENDA-WITH-VALID-SCOOP-CONNECTION-P", 1, 0, false);
        declareFunction("uia_handle_uia_update_scoop_create_term_event_event", "UIA-HANDLE-UIA-UPDATE-SCOOP-CREATE-TERM-EVENT-EVENT", 1, 1, false);
        declareFunction("uia_handle_uia_update_scoop_kill_term_event_event", "UIA-HANDLE-UIA-UPDATE-SCOOP-KILL-TERM-EVENT-EVENT", 1, 1, false);
        declareFunction("uia_handle_uia_update_scoop_assert_event_event", "UIA-HANDLE-UIA-UPDATE-SCOOP-ASSERT-EVENT-EVENT", 1, 1, false);
        declareFunction("uia_handle_uia_update_scoop_unassert_event_event", "UIA-HANDLE-UIA-UPDATE-SCOOP-UNASSERT-EVENT-EVENT", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_uia_listeners_file() {
        deflexical("*UIA-ADD-TERM-TO-CRUMB-TRAIL-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_CREATE_TERM_EVENT, UIA_HANDLE_ADD_TERM_TO_CRUMB_TRAIL_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-ADD-ASSERT-TO-CRUMB-TRAIL-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_ASSERT_EVENT, UIA_HANDLE_ADD_ASSERT_TO_CRUMB_TRAIL_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-CLEAR-WFF-CACHE-UNASSERT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_UNASSERT_EVENT, UIA_HANDLE_CLEAR_WFF_CACHE_UNASSERT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-CLEAR-WFF-CACHE-ASSERT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_ASSERT_EVENT, UIA_HANDLE_CLEAR_WFF_CACHE_ASSERT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-UIA-UPDATE-KREVIEWER-ASSERT-EVENT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_ASSERT_EVENT, UIA_HANDLE_UIA_UPDATE_KREVIEWER_ASSERT_EVENT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-UIA-UPDATE-KREVIEWER-UNASSERT-EVENT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_UNASSERT_EVENT, UIA_HANDLE_UIA_UPDATE_KREVIEWER_UNASSERT_EVENT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-UIA-UPDATE-SCOOP-CREATE-TERM-EVENT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_CREATE_TERM_EVENT, UIA_HANDLE_UIA_UPDATE_SCOOP_CREATE_TERM_EVENT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-UIA-UPDATE-SCOOP-KILL-TERM-EVENT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_KILL_TERM_EVENT, UIA_HANDLE_UIA_UPDATE_SCOOP_KILL_TERM_EVENT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-UIA-UPDATE-SCOOP-ASSERT-EVENT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_ASSERT_EVENT, UIA_HANDLE_UIA_UPDATE_SCOOP_ASSERT_EVENT_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*UIA-UIA-UPDATE-SCOOP-UNASSERT-EVENT-EVENT-LISTENER*", event_broker.describe_funcall_listener($RKF_UNASSERT_EVENT, UIA_HANDLE_UIA_UPDATE_SCOOP_UNASSERT_EVENT_EVENT, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_uia_listeners_file() {
                rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_add_term_to_crumb_trail_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_add_assert_to_crumb_trail_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_clear_wff_cache_unassert_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_clear_wff_cache_assert_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_uia_update_kreviewer_assert_event_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_uia_update_kreviewer_unassert_event_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_uia_update_scoop_create_term_event_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_uia_update_scoop_kill_term_event_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_uia_update_scoop_assert_event_event_listener$.getGlobalValue());
        rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($uia_uia_update_scoop_unassert_event_event_listener$.getGlobalValue());
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("EVENT"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt1$_UIA__A_EVENT_LISTENER_ = makeString("*UIA-~A-EVENT-LISTENER*");

    static private final SubLString $str_alt2$UIA_HANDLE__A_EVENT = makeString("UIA-HANDLE-~A-EVENT");







    private static final SubLSymbol DESCRIBE_FUNCALL_LISTENER = makeSymbol("DESCRIBE-FUNCALL-LISTENER");



    private static final SubLSymbol REGISTER_LISTENER_WITH_RKF_EVENT_DISPATCHER = makeSymbol("REGISTER-LISTENER-WITH-RKF-EVENT-DISPATCHER");

    private static final SubLSymbol $RKF_CREATE_TERM_EVENT = makeKeyword("RKF-CREATE-TERM-EVENT");

    private static final SubLSymbol UIA_HANDLE_ADD_TERM_TO_CRUMB_TRAIL_EVENT = makeSymbol("UIA-HANDLE-ADD-TERM-TO-CRUMB-TRAIL-EVENT");

    private static final SubLSymbol $RKF_ASSERT_EVENT = makeKeyword("RKF-ASSERT-EVENT");

    private static final SubLSymbol UIA_HANDLE_ADD_ASSERT_TO_CRUMB_TRAIL_EVENT = makeSymbol("UIA-HANDLE-ADD-ASSERT-TO-CRUMB-TRAIL-EVENT");

    private static final SubLSymbol $RKF_UNASSERT_EVENT = makeKeyword("RKF-UNASSERT-EVENT");

    private static final SubLSymbol UIA_HANDLE_CLEAR_WFF_CACHE_UNASSERT_EVENT = makeSymbol("UIA-HANDLE-CLEAR-WFF-CACHE-UNASSERT-EVENT");

    private static final SubLSymbol UIA_HANDLE_CLEAR_WFF_CACHE_ASSERT_EVENT = makeSymbol("UIA-HANDLE-CLEAR-WFF-CACHE-ASSERT-EVENT");

    private static final SubLSymbol UIA_WHY_NOT_WFF_COMPLIANT_MEMOIZED = makeSymbol("UIA-WHY-NOT-WFF-COMPLIANT-MEMOIZED");

    private static final SubLSymbol UIA_WHY_NOT_ASSERTIBLE_COMPLIANT_MEMOIZED = makeSymbol("UIA-WHY-NOT-ASSERTIBLE-COMPLIANT-MEMOIZED");

    static private final SubLSymbol $sym18$UIAT_SALIENT_DESCRIPTOR_BAD_PROMPT__MEMOIZED = makeSymbol("UIAT-SALIENT-DESCRIPTOR-BAD-PROMPT?-MEMOIZED");

    private static final SubLSymbol UIA_HANDLE_UIA_UPDATE_KREVIEWER_ASSERT_EVENT_EVENT = makeSymbol("UIA-HANDLE-UIA-UPDATE-KREVIEWER-ASSERT-EVENT-EVENT");

    private static final SubLSymbol UIA_HANDLE_UIA_UPDATE_KREVIEWER_UNASSERT_EVENT_EVENT = makeSymbol("UIA-HANDLE-UIA-UPDATE-KREVIEWER-UNASSERT-EVENT-EVENT");

    private static final SubLSymbol $SCOOP_SESSION = makeKeyword("SCOOP-SESSION");

    private static final SubLSymbol UIA_HANDLE_UIA_UPDATE_SCOOP_CREATE_TERM_EVENT_EVENT = makeSymbol("UIA-HANDLE-UIA-UPDATE-SCOOP-CREATE-TERM-EVENT-EVENT");

    private static final SubLSymbol $RKF_KILL_TERM_EVENT = makeKeyword("RKF-KILL-TERM-EVENT");

    private static final SubLSymbol UIA_HANDLE_UIA_UPDATE_SCOOP_KILL_TERM_EVENT_EVENT = makeSymbol("UIA-HANDLE-UIA-UPDATE-SCOOP-KILL-TERM-EVENT-EVENT");

    static private final SubLString $str_alt25$I_could_not_find_the_assertion_wi = makeString("I could not find the assertion with the sentence ~A in Mt ~A.");

    private static final SubLSymbol UIA_HANDLE_UIA_UPDATE_SCOOP_ASSERT_EVENT_EVENT = makeSymbol("UIA-HANDLE-UIA-UPDATE-SCOOP-ASSERT-EVENT-EVENT");

    private static final SubLSymbol UIA_HANDLE_UIA_UPDATE_SCOOP_UNASSERT_EVENT_EVENT = makeSymbol("UIA-HANDLE-UIA-UPDATE-SCOOP-UNASSERT-EVENT-EVENT");

    // // Initializers
    public void declareFunctions() {
        declare_uia_listeners_file();
    }

    public void initializeVariables() {
        init_uia_listeners_file();
    }

    public void runTopLevelForms() {
        setup_uia_listeners_file();
    }
}

